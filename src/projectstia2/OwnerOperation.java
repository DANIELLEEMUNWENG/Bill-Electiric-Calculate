/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstia2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class OwnerOperation {
    public void addRecord(Owners own) throws IOException 
    {  // emp = employee
        File fileName = new File("employee.txt");
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(own.getAccNum());
        pw.println(own.getBillDate());
        pw.println(own.getName());
        pw.println(own.getAddress());
        pw.println(own.getArrears());
        pw.println(own.getPreMeter());
        pw.println(own.getCurMeter());
        pw.println(own.getTotalUnit());
        pw.println(own.getCurCharge());
         pw.println(own.getTotalBill());
        pw.close();
        fw.close();
        
    }
    
     public ArrayList <Owners>  displayAllRecord() throws FileNotFoundException, IOException
    {
        ArrayList <Owners>owner = new ArrayList<Owners>();
        Owners own;
        
        File fileName = new File("employee.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine(); // 1st baris
        while (line != null)
        {
            //System.out.println(line);
            int accNum = Integer.parseInt(line); 
            String billDate= br.readLine();
            String name = br.readLine(); 
            String address = br.readLine(); // baris ke-4
            double arrears= Double.parseDouble(br.readLine()); // baris ke-6
            double preMeter = Double.parseDouble(br.readLine()); // baris ke-7
            double curMeter = Double.parseDouble(br.readLine()); // baris ke-8
            double totalUnit = Double.parseDouble(br.readLine()); // baris ke-9
            double curCharge = Double.parseDouble(br.readLine());
            double totalBill = Double.parseDouble(br.readLine());
            
            own = new Owners(accNum,  billDate,  name,  address,  arrears,  preMeter,  curMeter,  totalUnit,  curCharge,  totalBill);
            owner.add(own);  // store into arraylist
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        return owner;
        
    } // displayAllRecord
     
     
     public ArrayList <Owners>  readAllRecordFromFile() throws FileNotFoundException, IOException
    {
        ArrayList <Owners> owner = new ArrayList<Owners>();
        Owners own;
        
        File fileName = new File("employee.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null)
        {
            //System.out.println(line);
            int accNum = Integer.parseInt(line); 
            String billDate= br.readLine();
            String name = br.readLine(); 
            String address = br.readLine(); // baris ke-4
            double arrears= Double.parseDouble(br.readLine()); // baris ke-6
            double preMeter = Double.parseDouble(br.readLine()); // baris ke-7
            double curMeter = Double.parseDouble(br.readLine()); // baris ke-8
            double totalUnit = Double.parseDouble(br.readLine()); // baris ke-9
            double curCharge = Double.parseDouble(br.readLine());
            double totalBill = Double.parseDouble(br.readLine());
            
            own = new Owners(accNum,  billDate,  name,  address,  arrears,  preMeter,  curMeter,  totalUnit,  curCharge,  totalBill);
            owner.add(own);  // store into arraylist
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        return owner;
    } // readAllRecordFromFile
    
    public Owners findRecord(int AccNum) throws FileNotFoundException, IOException
    {
        Owners own = null;
        ArrayList <Owners> ownerList = readAllRecordFromFile();
        
        for (int i=0; i < ownerList.size(); i++)
        {
            if(AccNum == ownerList.get(i).getAccNum())
            {
                own = ownerList.get(i);
                System.out.println("Record has been found");
            }
                
        }
        return own;
    }
    
    public void addAllRecordInFile(ArrayList <Owners> owners) throws IOException
    {
        File fileName = new File("employee.txt");
        FileWriter fw = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(fw);
        
        for (int i=0; i < owners.size(); i++)
        {
            pw.println(owners.get(i).getAccNum());
            pw.println(owners.get(i).getBillDate());
            pw.println(owners.get(i).getName());
            pw.println(owners.get(i).getAddress());
            pw.println(owners.get(i).getArrears());
            pw.println(owners.get(i).getPreMeter());
            pw.println(owners.get(i).getCurMeter());
            pw.println(owners.get(i).getTotalUnit());
            pw.println(owners.get(i).getCurCharge());
            pw.println(owners.get(i).getTotalBill());
        }
        pw.close();
        fw.close();
    } //addAllRecordInFile
    
      public double calculateCurrentCharge(double totalUnit)
    {
       double Charge;
       
       if (totalUnit >= 1 && totalUnit <=200)
       {
           Charge = 200*0.218;
       }
       else if (totalUnit >= 201 && totalUnit <=300)
       {
           Charge = (200*0.218)+(100*0.334);
       }
       else if (totalUnit >=301 && totalUnit <=600)
       {
           Charge = (200*0.218)+(100*0.334)+(300*0.516);
       }
       else if (totalUnit >=601 && totalUnit <= 900)
       {
           Charge = (200*0.218)+(100*0.334)+(300*0.516)+((totalUnit-600)*0.546);
       }
       else //totalUnit >= 901
       {
           Charge = (200*0.218)+(100*0.334)+(300*0.516)+(300*0.546)+((totalUnit-900)*0.571);
       }
       return Charge;
    }
    
}
