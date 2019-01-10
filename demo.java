import java.sql.*;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		int r;
		String s_name,br_name;
			// TODO Auto-generated method stub
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","");
				Statement st=con.createStatement();
				
				
				Scanner sc=new Scanner(System.in);
				System.out.println(" Enter  Name  Branch and Rollno: ");
				
				s_name=sc.nextLine();
				br_name=sc.nextLine();
				r=sc.nextInt();
				
				String s="INSERT INTO student2"+" values("+r+",'"+s_name+"','"+br_name+"')";
				int c=st.executeUpdate(s);
				ResultSet rs=st.executeQuery("select *from student2");
				while(rs.next())
				{
					System.out.println(rs.getInt(1) +"  "+ rs.getString("name"));
				}
				
		}
	 catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}
}
