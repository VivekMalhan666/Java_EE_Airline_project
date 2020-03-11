/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import Models.Buisness;
import Models.Economy;
import Models.Firstclass;
import Models.Flight;
import Models.Person;
import Models.Seats;
import Models.p;
import com.mysql.jdbc.Connection;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raghda
 */
public class DB {
    
    

    public static Connection getCon() 
{   
          PreparedStatement PreparedStatement=null;
          Connection con=null;       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Windowsphone");
        } catch (ClassNotFoundException ex) {
            System.out.println("SQL Exception: "+ ex.toString());

            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());

            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return con;
    }
    
    
    public static String signupuser(Person P) throws ClassNotFoundException, SQLException
    {
        String status="";
        try{
    
        Connection con=DB.getCon();

        String firstname=P.getFName();
        String lastname=P.getLName();
        String email=P.getEmail();
        String pswd=P.getPassword();
        String num=P.getContact();
        String credit=P.getCreditno();
        
        String Query = "Insert into signup(firstName,lastName,Email,pswd,contact,creditcardno)" 
                +"values(?,?,?,?,?,?)";
        PreparedStatement st=con.prepareStatement(Query);
       
        st.setString(1,P.getFName());
        st.setString(2,P.getLName());
        st.setString(3,P.getEmail());
        st.setString(4,P.getPassword());
        st.setString(5,P.getContact());
        st.setString(6,P.getCreditno());
        
        int i=st.executeUpdate();

        if(i>0)
        {
         status= "success";
         con.close();
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
       return status; 
    }

    public String Addflight(Flight f) throws ClassNotFoundException, SQLException{
        String status="";
        try{
    
        Connection con=DB.getCon();
        
        
        String departure=f.getDeparture();
         String arrival=f.getArrival();
         String source=f.getSource();
         String destination=f.getDestination();
         String name=f.getName();
         int fid = f.getFid();
         
         String Query = "Insert into flight(fid,source,destination,departure,arrival,fname)" 
                +"values(?,?,?,?,?,?)";
         PreparedStatement st=con.prepareStatement(Query);
         st.setInt(1,fid);
         st.setString(2,source);
         st.setString(3,destination);
         st.setString(4,departure);
         st.setString(5,arrival);
         st.setString(6,name);
         int i=st.executeUpdate();

        if(i>0)
        {
         status= "success";
         con.close();
        }
        }
        
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
     }
       return status; 
    }

    public boolean SearchFlight(int fid) throws ClassNotFoundException, SQLException{
       boolean temp=false;
       Connection con=DB.getCon();
       try{
        
        String Query = "select fid from flight where fid=?";
        PreparedStatement st=con.prepareStatement(Query);
        st.setInt (1, fid);
           ResultSet i= st.executeQuery();
           if (i.next()) {
            temp=true;
            } 
           else {
            temp=false;
            }
        con.close();
    }
      catch(SQLException e)
    {
        e.printStackTrace();
         temp=false;
}  
        return temp;
        
    }

    public String insertprices(Firstclass ff, Buisness bb, Economy ee,Flight flight) throws SQLException {
        String status=" ";
        Connection con=DB.getCon();
        try{
            int fprice=ff.getPrice();
            int bprice=bb.getPrice();
            int eprice=ee.getPrice();
            int fid=flight.getFid();
            
            //checking if a flightid already exists and we are trying to set again on the 
            //same flight
          String Query = "select fid from firstclass where fid=?";
        PreparedStatement sf=con.prepareStatement(Query);
        sf.setInt (1, fid);
           ResultSet df= sf.executeQuery();
           if (df.next()) {
                
            String Query1 = "select fid from firstclass where fid=? and availability=?";
        PreparedStatement sf1=con.prepareStatement(Query1);
        sf1.setInt (1, fid);
        sf1.setInt (2, 1);
           ResultSet df1= sf1.executeQuery();
                if(!df1.next()){
           String qf="update firstclass set price=?,availability=? where fid=?";
                PreparedStatement preparedf = con.prepareStatement(qf);
                 preparedf.setInt(1,fprice);
                 preparedf.setInt(2, 1);
                 preparedf.setInt(3, fid);
                 int iif=preparedf.executeUpdate();
                 if(iif>0)
                {
                  status= "success";
         
                }
                 else{
                     status="oops";
                 }
                
             }
                else{
                    status="oops";
                }
           }
            
           else {
            String Query2f = "Insert into firstclass(fid,price,availability)" 
                +"values(?,?,?)";
             PreparedStatement sff=con.prepareStatement(Query2f);
         sff.setInt(1,fid);
         sff.setInt(2,fprice);
         sff.setInt(3,1);
         int iff=sff.executeUpdate();
         if(iff>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
            }
            //-----------------------
                       //checking if a flightid already exists and we are trying to set again on the 
            //same flight
          String Queryfbb = "select fid from buisness where fid=?";
        PreparedStatement s=con.prepareStatement(Queryfbb);
        s.setInt (1, fid);
           ResultSet d= s.executeQuery();
           if (d.next()) {
                String h="select fid from buisness where fid=? and availability=?";
                PreparedStatement ph=con.prepareStatement(h);
                ph.setInt(1,fid);
                ph.setInt(2,1);
                ResultSet ph1=ph.executeQuery();
                if(!ph1.next()){
            
           String q1fbb="update buisness set price=?,availability=? where fid=?";
                PreparedStatement preparedStmtfbb = con.prepareStatement(q1fbb);
                 preparedStmtfbb.setInt(1, bprice);
                 preparedStmtfbb.setInt(2, 1);
                 preparedStmtfbb.setInt(3, fid);
                 int iifbb=preparedStmtfbb.executeUpdate();
                 if(iifbb>0)
                {
                  status= "success";
         
                }
                 else{
                     status="oops";
                 }
                }  
                else{
                     status="oops";
                 }
             }
             
           
           else {
            String Query2fbb = "Insert into buisness(fid,price,availability)" 
                +"values(?,?,?)";
             PreparedStatement st2fbb=con.prepareStatement(Query2fbb);
         st2fbb.setInt(1,fid);
         st2fbb.setInt(2,bprice);
         st2fbb.setInt(3,1);
         int i2fbb=st2fbb.executeUpdate();
         if(i2fbb>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
            }
            //------------------------
                              //checking if a flightid already exists and we are trying to set again on the 
            //same flight
          String Querye = "select fid from economy where fid=?";
        PreparedStatement ste=con.prepareStatement(Querye);
        ste.setInt (1, fid);
           ResultSet iee= ste.executeQuery();
           if (iee.next()) {
                String q3="select fid from economy where fid=? and availability=?";
                PreparedStatement ep=con.prepareStatement(q3);
                ep.setInt(1,fid);
                ep.setInt(2, 1);
                ResultSet r=ep.executeQuery();
                if(!r.next()){
            
           String q1e="update economy set price=?,availability=? where fid=?";
                PreparedStatement preparedStmte = con.prepareStatement(q1e);
                 preparedStmte.setInt(1, eprice);
                 preparedStmte.setInt(2, 1);
                 preparedStmte.setInt(3, fid);
                 int iie=preparedStmte.executeUpdate();
                 if(iie>0)
                {
                  status= "success";
         
                }
                 else{
                     status="oops";
                 }
                   
            } 
                else{
                     status="oops";
                 }
           }
           else {
            String Query2e = "Insert into economy(fid,price,availability)" 
                +"values(?,?,?)";
             PreparedStatement st2e=con.prepareStatement(Query2e);
         st2e.setInt(1,fid);
         st2e.setInt(2,eprice);
         st2e.setInt(3,1);
         int i2e=st2e.executeUpdate();
         if(i2e>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
            }
       
          con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
        
                                                                                     }

    public String updateprices(int fid, String type, int price) throws ClassNotFoundException, SQLException{
        String status="";
        Connection con=DB.getCon();
        try{
            if(type.equals("First Class"))
            {
                String q="update firstclass set price=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, price);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else if(type.equals("Business"))
            {
                String q="update buisness set price=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, price);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else if(type.equals("Economy"))
            {
                String q="update economy set price=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, price);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else
            {
                status="unsuccessful update";
            }
            
            con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
    }

    public String inserttotalseats(Firstclass ff, Buisness bb, Economy ee,Flight flight) throws ClassNotFoundException, SQLException
    {  String status="";
        Connection con=DB.getCon();
        try{
            int fseat=ff.getNoOfSeats();
            int bseat=bb.getNoOfSeats();
            int eseat=ee.getNoOfSeats();
            int fid=flight.getFid();
            String s="available";
            
            String Qs = "select fid from firstclass where fid=?";
        PreparedStatement stss=con.prepareStatement(Qs);
        stss.setInt (1, fid);
           ResultSet iss= stss.executeQuery();
           if (iss.next()) {
               
               String q3="update firstclass set noofseats=?,seatavailability=? where fid=?";
                PreparedStatement pr = con.prepareStatement(q3);
                 pr.setInt(1, fseat);
                 pr.setString(2, s);
                 pr.setInt(3, fid);
                 int ii=pr.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
                 else{
                     status= "oops";
                 }
           }
           else{
               String Qe = "Insert into firstclass(fid,noofseats,seatavailability)" 
                +"values(?,?,?)";
             PreparedStatement sf=con.prepareStatement(Qe);
         sf.setInt(1,fid);
         sf.setInt(2,fseat);
         sf.setString(3,s);
         int ifff=sf.executeUpdate();
         if(ifff>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
           }
           //-------------------------
             String Qsb = "select fid from buisness where fid=?";
        PreparedStatement stsb=con.prepareStatement(Qsb);
        stsb.setInt (1, fid);
           ResultSet isb= stsb.executeQuery();
           if (isb.next()) {
               
               String q3b="update buisness set noofseats=?,seatavailability=? where fid=?";
                PreparedStatement prb = con.prepareStatement(q3b);
                 prb.setInt(1, bseat);
                 prb.setString(2, s);
                 prb.setInt(3, fid);
                 int iib=prb.executeUpdate();
                 if(iib>0)
                {
                  status= "success";
         
                }
                 else{
                     status= "oops";
                 }
           }
           else{
               String Qeb = "Insert into buisness(fid,noofseats,seatavailability)" 
                +"values(?,?,?)";
             PreparedStatement sb=con.prepareStatement(Qeb);
         sb.setInt(1,fid);
         sb.setInt(2,bseat);
         sb.setString(3,s);
         int iffb=sb.executeUpdate();
         if(iffb>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
           }
           //----------------------------
           String Qsbe = "select fid from economy where fid=?";
        PreparedStatement stsbe=con.prepareStatement(Qsbe);
        stsbe.setInt (1, fid);
           ResultSet isbe= stsbe.executeQuery();
           if (isbe.next()) {
               
               String q3be="update economy set noofseats=?,seatavailability=? where fid=?";
                PreparedStatement prbe = con.prepareStatement(q3be);
                 prbe.setInt(1, eseat);
                 prbe.setString(2, s);
                 prbe.setInt(3, fid);
                 int iibe=prbe.executeUpdate();
                 if(iibe>0)
                {
                  status= "success";
         
                }
                 else{
                     status= "oops";
                 }
           }
           else{
               String Qebe = "Insert into economy(fid,noofseats,seatavailability)" 
                +"values(?,?,?)";
             PreparedStatement sbe=con.prepareStatement(Qebe);
         sbe.setInt(1,fid);
         sbe.setInt(2,eseat);
         sbe.setString(3,s);
         
         int iffbe=sbe.executeUpdate();
         if(iffbe>0)
        {
         status= "success";
         
        }
         else{
             status="oops";
         }
           }
           
           //--------------------------
           con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
}

    public String updateseats(int fid, String type, int seats) throws ClassNotFoundException, SQLException{
        String status="";
        Connection con=DB.getCon();
        try{
            if(type.equals("First Class"))
            {
                String q="update firstclass set noofseats=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, seats);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else if(type.equals("Business"))
            {
                String q="update buisness set noofseats=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, seats);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else if(type.equals("Economy"))
            {
                String q="update economy set noofseats=? where fid=?";
                PreparedStatement preparedStmt = con.prepareStatement(q);
                 preparedStmt.setInt(1, seats);
                 preparedStmt.setInt(2, fid);
                 int ii=preparedStmt.executeUpdate();
                 if(ii>0)
                {
                  status= "success";
         
                }
            }
            else
            {
                status="unsuccessful update";
            }
            
            con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
    }
    public String setdeals(Flight flight, Firstclass ff, Buisness bb, Economy ee, String type) {
    String status="";
        Connection con=DB.getCon();
        try{
            String fmeal=ff.getFooddeals();
            String fmovie=ff.getMoviedeals();
            
            String bmeal=bb.getFooddeals();
            String bmovie=bb.getMoviedeals();
            
            String emeal=ee.getFooddeals();
            String emovie=ee.getMoviedeals();
            int fid=flight.getFid();
            
            //checking if a flightid already exists and we are trying to set again on the 
            //same flight
            if(type.equals("First Class"))
            {
            
            String Query = "update firstclass set fooddeals=?,moviedeals=? where fid=?";
            PreparedStatement st=con.prepareStatement(Query);
         
         st.setString(1,fmeal);
         st.setString(2,fmovie);
         st.setInt(3,fid);
         int i=st.executeUpdate();
         if(i>0)
        {
         status= "success";
         
        }
            
                 
            }
            //-----------------------
            if(type.equals("Business")){
      String Query = "update buisness set fooddeals=?,moviedeals=? where fid=?";
            PreparedStatement st=con.prepareStatement(Query);
         
         st.setString(1,bmeal);
         st.setString(2,bmovie);
         st.setInt(3,fid);
         int i=st.executeUpdate();
         if(i>0)
        {
         status= "success";
         
        }
            
            }
            //------------------------
            if(type.equals("Economy")){
    String Query1 = "update economy set fooddeals=?,moviedeals=? where fid=?";
            PreparedStatement st=con.prepareStatement(Query1);
         
         st.setString(1,emeal);
         st.setString(2,emovie);
         st.setInt(3,fid);
         int i=st.executeUpdate();
         if(i>0)
        {
         status= "success";
         
        }
            
        }
            con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
        
                                                     
    }

    public String login(Person P)  throws ClassNotFoundException, SQLException{
         String status="oops";
        Connection con=DB.getCon();
        try{
        String email=P.getEmail();
        String password=P.getPassword();
        
        String Query = "select * from signup where Email=? AND pswd=?";
        PreparedStatement st=con.prepareStatement(Query);
        st.setString(1,email);
         st.setString(2,password);
         ResultSet rs0=st.executeQuery();
        if(rs0.next())
        {
         status= "customer";
         P.setContact(rs0.getString("contact"));
         P.setCreditno(rs0.getString("creditcardno"));
         P.setFName(rs0.getString("firstName"));
         P.setLName(rs0.getString("lastName"));

         
        }
         
        String Query1 = "select * from admin where Email=? AND pswd=?";
        PreparedStatement st1=con.prepareStatement(Query1);
        st1.setString(1,email);
         st1.setString(2,password);
         ResultSet rs=st1.executeQuery();
        if(rs.next())
        {
         status= "admin";
         P.setContact(rs.getString("contact"));
         P.setCreditno(rs.getString("creditcardno"));
         P.setFName(rs.getString("firstName"));
         P.setLName(rs.getString("lastName"));
         
        }
         
         
         String Query2 = "select * from manager where Email=? AND pswd=?";
        PreparedStatement st2=con.prepareStatement(Query2);
        st2.setString(1,email);
         st2.setString(2,password);
         ResultSet rs1=st2.executeQuery();
        if(rs1.next()){
         status= "manager";
         P.setContact(rs1.getString("contact"));
         P.setCreditno(rs1.getString("creditcardno"));
         P.setFName(rs1.getString("firstName"));
         P.setLName(rs1.getString("lastName"));
        }
         
         
        con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= "oops Something went wrong";
}
        return status;
        
         }

  
    

    public boolean favailability(int fid, Firstclass f)throws ClassNotFoundException, SQLException {
        boolean status=false;
        Connection con=DB.getCon();
        try{
        String Qu = "select * from firstclass where fid=? and seatavailability=?";
        PreparedStatement st5=con.prepareStatement(Qu);
        st5.setInt(1,fid);
         st5.setString(2,"available");
         ResultSet rs5=st5.executeQuery();
        if(rs5.next())
        {
           status=true; 
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
        }

    public boolean bavailability(int fid, Buisness b)
    {
        boolean status=false;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select * from buisness where fid=? and seatavailability=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
         st6.setString(2,"available");
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           status=true; 
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean eavailability(int fid, Economy e) {
    boolean status=false;
        Connection con=DB.getCon();
        try{
        String Qu = "select * from economy where fid=? and seatavailability=?";
        PreparedStatement st5=con.prepareStatement(Qu);
        st5.setInt(1,fid);
         st5.setString(2,"available");
         ResultSet rs5=st5.executeQuery();
        if(rs5.next())
        {
           status=true; 
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
           
    }

    public boolean fgetprice(int fid, Firstclass f) throws ClassNotFoundException, SQLException{
        boolean status=false;
        int prices=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select price from firstclass where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           prices=rs6.getInt(1);
           
           f.setPrice(prices);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean bgetprice(int fid, Buisness b) {
        boolean status=false;
        int prices=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select price from buisness where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           prices=rs6.getInt(1);
           
           b.setPrice(prices);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
           }

    public boolean egetprice(int fid, Economy e) {
               boolean status=false;
        int prices=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select price from economy where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           prices=rs6.getInt(1);
           
           e.setPrice(prices);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
       }

    public boolean approveprices(int fid) throws ClassNotFoundException, SQLException{
        boolean status=false;
        Connection con=DB.getCon();
        try{
    String Qss = "select fid from approve where fid=?";
        PreparedStatement stsss=con.prepareStatement(Qss);
        stsss.setInt (1, fid);
           ResultSet isss= stsss.executeQuery();
           if (isss.next()) {
               
               String q3="update approve set status=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setInt(1, 1);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
           }
           else{
        
       String Q = "Insert into approve(fid,status)" 
                +"values(?,?)";
             PreparedStatement sa=con.prepareStatement(Q);
         sa.setInt(1,fid);
         sa.setInt(2,1); //1 for approve
         

         int i=sa.executeUpdate();
         if(i>0)
        {
         status= true;
         
        }
         else{
             status=false;
         }
           }
         con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= false;
     }
       return status; 
    }

    public boolean disapproveprices(int fid) throws ClassNotFoundException, SQLException{
        boolean status=false;
        Connection con=DB.getCon();
        try{
    String Qss = "select fid from approve where fid=?";
        PreparedStatement stsss=con.prepareStatement(Qss);
        stsss.setInt (1, fid);
           ResultSet isss= stsss.executeQuery();
           if (isss.next()) {
               
               String q3="update approve set status=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setInt(1, 0);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
           }
           else{
        
       String Q = "Insert into approve(fid,status)" 
                +"values(?,?)";
             PreparedStatement sa=con.prepareStatement(Q);
         sa.setInt(1,fid);
         sa.setInt(2,0); //0 for approve
         

         int i=sa.executeUpdate();
         if(i>0)
        {
         status= true;
         
        }
         else{
             status=false;
         }
           }
         con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= false;
     }
       return status; 
    }

    public boolean comment(int fid,String sub) {
        boolean status=false;
        Connection con=DB.getCon();
        try{
    String Qss = "select fid from approve where fid=?";
        PreparedStatement stsss=con.prepareStatement(Qss);
        stsss.setInt (1, fid);
           ResultSet isss= stsss.executeQuery();
           if (isss.next()) {
               
               String q3="update approve set suggestions=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setString(1, sub);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
           }
           else{
        
       String Q = "Insert into approve(fid,suggestions)" 
                +"values(?,?)";
             PreparedStatement sa=con.prepareStatement(Q);
         sa.setInt(1,fid);
         sa.setString(2,sub); 
         

         int i=sa.executeUpdate();
         if(i>0)
        {
         status= true;
         
        }
         else{
             status=false;
         }
           }
         con.close();
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status= false;
     }
       return status; 

    }

    public boolean fgetseats(int fid, Firstclass f)  throws ClassNotFoundException, SQLException{
        boolean status=false;
        int seats=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select noofseats from firstclass where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           seats=rs6.getInt(1);
           
           f.setNoOfSeats(seats);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }
     

    public boolean bgetseats(int fid, Buisness b)  throws ClassNotFoundException, SQLException{
        boolean status=false;
        int seats=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select noofseats from buisness where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           seats=rs6.getInt(1);
           
           b.setNoOfSeats(seats);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }
     

    public boolean egetseats(int fid, Economy e) throws ClassNotFoundException, SQLException{
        boolean status=false;
        int seats=0;
        Connection con=DB.getCon();
        try{
        String Qu6 = "select noofseats from economy where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           seats=rs6.getInt(1);
           
           e.setNoOfSeats(seats);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean egetdeals(int fid, Economy e)  throws ClassNotFoundException, SQLException{
        boolean status=false;
        String m="";
        String food="";
        Connection con=DB.getCon();
        try{
        String Qu6 = "select moviedeals,fooddeals from economy where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           m=rs6.getString("moviedeals");
           food=rs6.getString("fooddeals");
           
           e.setMoviedeals(m);
           e.setFooddeals(food);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean bgetdeals(int fid, Buisness b) throws ClassNotFoundException, SQLException{
        boolean status=false;
        String m="";
        String food="";
        Connection con=DB.getCon();
        try{
        String Qu6 = "select moviedeals,fooddeals from buisness where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           m=rs6.getString("moviedeals");
           food=rs6.getString("fooddeals");
           
           b.setMoviedeals(m);
           b.setFooddeals(food);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean fgetdeals(int fid, Firstclass f) throws ClassNotFoundException, SQLException{
        boolean status=false;
        String m="";
        String food="";
        Connection con=DB.getCon();
        try{
        String Qu6 = "select moviedeals,fooddeals from firstclass where fid=?";
        PreparedStatement st6=con.prepareStatement(Qu6);
        st6.setInt(1,fid);
        
         ResultSet rs6=st6.executeQuery();
        if(rs6.next())
        {
           m=rs6.getString("moviedeals");
           food=rs6.getString("fooddeals");
           
           f.setMoviedeals(m);
           f.setFooddeals(food);
           status=true;
        }
        else
        {  
        status=false;
        }
       
        con.close();
        }
         
        catch(SQLException ex)
       {
        ex.printStackTrace();
         status= false;
       }
        return status;
        
    }

    public boolean booking(Flight f, int peopleno, String email)throws ClassNotFoundException, SQLException {
        boolean status=false;
        try{
    
        Connection con=DB.getCon();

        String departure=f.getDeparture();
        String origin=f.getSource();
        String arrival=f.getArrival();
        String dest=f.getDestination();
        
        String Query="insert into booking(source,destination,arrival,email,noofpeople,departure)"+"values(?,?,?,?,?,?)";
       PreparedStatement p=con.prepareStatement(Query);
       p.setString(1,origin);
       p.setString(2,dest);
       p.setString(3,arrival);
       p.setString(4,email);
       p.setInt(5,peopleno);
       p.setString(6,departure);
       int ii=p.executeUpdate();
       if(ii>0)
       {
           status=true;
       }
       else{
           status=false;
       }
        con.close();
        
         }
        catch(SQLException e)
    {
        e.printStackTrace();
         status=false;
     }
    
    return status;
    }

    public boolean confirmbookingf(int fid, int number) throws ClassNotFoundException, SQLException
    {
        int m=0;
    
        boolean status=false;
        try{
    
        Connection con=DB.getCon();
        String q="select noofseats from firstclass where fid=?";
        PreparedStatement p=con.prepareStatement(q);
       p.setInt(1,fid);
       ResultSet rs6=p.executeQuery();
        if(rs6.next())
        {
           m=rs6.getInt("noofseats");
           if(m<number)
           {
               status=false;
           }
           if(m==0)
           {
               String q3="update firstclass set seatavailability=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setString(1, "notavailable");
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           
               status=false;
           }
           if(m>=number)
           {
               m=m-number;
               String q3="update firstclass set noofseats=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setInt(1, m);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           }
           }
         
        else{
            status=false;
        }
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status=false;
     }
    
    return status;
    }
    public boolean confirmbookinge(int fid, int number) 
     {
        int m=0;
    
        boolean status=false;
        try{
    
        Connection con=DB.getCon();
        String q="select noofseats from economy where fid=?";
        PreparedStatement p=con.prepareStatement(q);
       p.setInt(1,fid);
       ResultSet rs6=p.executeQuery();
        if(rs6.next())
        {
           m=rs6.getInt("noofseats");
           if(m<number)
           {
               status=false;
           }
           if(m==0)
           {
               String q3="update economy set seatavailability=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setString(1, "notavailable");
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           
               status=false;
           }
           if(m>=number)
           {
               m=m-number;
               String q3="update economy set noofseats=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setInt(1, m);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           }
           }
         
        else{
            status=false;
        }
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status=false;
     }
    
    return status;
    }    
    

    public boolean confirmbookingb(int fid, int number)
             {
        int m=0;
    
        boolean status=false;
        try{
    
        Connection con=DB.getCon();
        String q="select noofseats from buisness where fid=?";
        PreparedStatement p=con.prepareStatement(q);
       p.setInt(1,fid);
       ResultSet rs6=p.executeQuery();
        if(rs6.next())
        {
           m=rs6.getInt("noofseats");
           if(m<number)
           {
               status=false;
           }
           if(m==0)
           {
               String q3="update buisness set seatavailability=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setString(1, "notavailable");
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           
               status=false;
           }
           if(m>=number)
           {
               m=m-number;
               String q3="update buisness set noofseats=? where fid=?";
                PreparedStatement pre = con.prepareStatement(q3);
                 pre.setInt(1, m);
                 pre.setInt(2, fid);
                 
                 int ii=pre.executeUpdate();
                 if(ii>0)
                {
                  status= true;
         
                }
                 else{
                     status= false;
                 }
                 
           }
           }
         
        else{
            status=false;
        }
        }
        catch(SQLException e)
    {
        e.printStackTrace();
         status=false;
     }
    
    return status;
    }
    }//ending bracket of file