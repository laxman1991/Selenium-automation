package str.basic.stringoperations;

import java.sql.SQLException;

public class StringBasicOperations {

public static void main(String[] args) throws ClassNotFoundException, SQLException {

String name="java";
  
  long starttime=System.currentTimeMillis();
  StringBuffer buffer= new StringBuffer(name);
  long totaltimes=0l;
  long endtime=0l;
  for(int i=0;i<10000;i++)
  {
  buffer.append(" test cddfdsf fsdf dsfds fds df dfdf");
  }
  totaltimes=System.currentTimeMillis()-starttime;
  System.out.println("time taken by String buffer is :"+totaltimes);
  long starttimeBuilder=System.currentTimeMillis();
  StringBuilder buider= new StringBuilder();
  for(int i=0;i<10000;i++)
  {
  buider.append(" test cddfdsf fsdf dsfds fds df dfdf");
  }
  System.out.println("time taken by String builder is :"+(System.currentTimeMillis()-starttimeBuilder));
}
}
