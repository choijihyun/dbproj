package com.ji.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class CarVO {
	private int carId;
	private int compId;
	private String name;
	private String carNum;
	private int carMember;
	private int rentFee;
	private String regiDate;
	private String details;

	CarVO(int carId, String name, String carNum, int carMember, String carImage, int rentFee, int compId, String regiDate, String details) {
		this.carId = carId;
		this.compId = compId;
		this.name = name;
		this.carNum = carNum;
		this.carMember = carMember;
		this.rentFee = rentFee;
		this.regiDate = regiDate;
		this.details = details;
	}

	public int getcarId() {
		return this.carId;
	}

	public int getcompId() {
		return this.compId;
	}

	public String getname() {
		return this.name;
	}

	public String getcarNum() {
		return this.carNum;
	}

	public int getcarMember() {
		return this.carMember;
	}

	public int getrentFee() {
		return this.rentFee;
	}

	public String getregiDate() {
		return this.regiDate;
	}

	public String getdetails() {
		return this.details;
	}

	public void setcarId(int id) {
		this.carId = id;
	}

	public void setcompId(int id) {
		this.compId = id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcarNum(String num) {
		this.carNum = num;
	}

	public void setcarMember(int num) {
		this.carMember = num;
	}

	public void setrentFee(int fee) {
		this.rentFee = fee;
	}

	public void setregiDate(String date) {
		this.regiDate = date;
	}

	public void setdetails(String details) {
		this.details = details;
	}

	public String toString() {
		return "CarVO [carId=" + carId + ",compId=" + compId + ",name=" + name + ",carNum=" + carNum + ",carMember="
				+ carMember + ",rentFee=" + rentFee + ",regiDate=" + regiDate + ",details" + details;
	}
}

class CompanyVO {
	private int compId;
	private String name;
	private String address;
	private String number;
	private String masterName;
	private String email;

	CompanyVO(int compId, String name, String address, String number, String email, String masterName) {
		this.compId = compId;
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
		this.masterName = masterName;
	}

	public int getcompId() {
		return this.compId;
	}

	public String getname() {
		return this.name;
	}

	public String getaddress() {
		return this.address;
	}

	public String getnumber() {
		return this.number;
	}

	public String getemail() {
		return this.email;
	}

	public String getmasterName() {
		return this.masterName;
	}

	public void setcompId(int compId) {
		this.compId = compId;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setmasterName(String name) {
		this.masterName = name;
	}

	public String toString() {
		return "CustomerVO [compId=" + compId + ",name=" + name + ",address=" + address + ",number=" + number
				+ ",email=" + email + ",masterName=" + masterName;
	}
}

class CustomerVO {
	private int driveLicenseId;
	private String name;
	private String address;
	private String number;
	private String email;
	private String beforeUsed;
	private String beforeUsedCar;

	CustomerVO(int driveLicenseId, String name, String address, String number, String email, String beforeUsed,
			String beforeUsedCar) {
		this.driveLicenseId = driveLicenseId;
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
		this.beforeUsed = beforeUsed;
		this.beforeUsedCar = beforeUsedCar;
	}

	public int getdriveLicenseId() {
		return this.driveLicenseId;
	}

	public String getname() {
		return this.name;
	}

	public String getaddress() {
		return this.address;
	}

	public String getnumber() {
		return this.number;
	}

	public String getemail() {
		return this.email;
	}

	public String getbeforeUsed() {
		return this.beforeUsed;
	}

	public String getbeforeUsedCar() {
		return this.beforeUsedCar;
	}

	public void setdriveLicenseId(int driveLicenseId) {
		this.driveLicenseId = driveLicenseId;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setbeforeUsed(String beforeUsed) {
		this.beforeUsed = beforeUsed;
	}

	public void setbeforeUsedCar(String beforeUsedCar) {
		this.beforeUsedCar = beforeUsedCar;
	}

	public String toString() {
		return "CustomerVO [driveLicenseId=" + driveLicenseId + ",name=" + name + ",address=" + address + ",number="
				+ number + ",email=" + email + ",beforeUsed=" + beforeUsed + ",beforeUsedCar=" + beforeUsedCar;
	}
}

class RentVO {
	private int rentId;
	private int driveLicenseId;
	private int carId;
	private int compId;
	private String startDate;
	private int totalDate;
	private int fee;
	private String deadline;
	private String additionalHistory;
	private int additionalFee;

	RentVO(int rentId, int driveLicenseId, int carId, int compId, String startDate, int totalDate, int fee,
			String deadline, String additionalHistory, int additionalFee) {
		this.rentId = rentId;
		this.driveLicenseId = driveLicenseId;
		this.carId = carId;
		this.compId = compId;
		this.startDate = startDate;
		this.totalDate = totalDate;
		this.fee = fee;
		this.deadline = deadline;
		this.additionalHistory = additionalHistory;
		this.additionalFee = additionalFee;
	}// constructor

	public int getRentId() {
		return rentId;
	}

	public int getDriveLicenseId() {
		return driveLicenseId;
	}

	public int getCarId() {
		return carId;
	}

	public int getCompId() {
		return compId;
	}

	public String getStartDate() {
		return startDate;
	}

	public int getTotalDate() {
		return totalDate;
	}

	public int getFee() {
		return fee;
	}

	public String getDeadline() {
		return deadline;
	}

	public String getAdditionalHistory() {
		return additionalHistory;
	}

	public int getAdditionalFee() {
		return additionalFee;
	}
	// getter

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public void setDriveLicenseId(int driveLicenseId) {
		this.driveLicenseId = driveLicenseId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setTotalDate(int totalDate) {
		this.totalDate = totalDate;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public void setAdditionalHistory(String additionalHistory) {
		this.additionalHistory = additionalHistory;
	}

	public void setAdditionalFee(int additionalFee) {
		this.additionalFee = additionalFee;
	}
	// setter

	@Override
	public String toString() {
		return "RentVO [" + rentId + driveLicenseId + carId + compId + startDate + totalDate + fee + deadline
				+ additionalHistory + additionalFee + "]";
	}
}

class RepairVO {
	private int repairId;
	private String name;
	private String address;
	private String number;
	private String masterName;
	private String email;

	RepairVO(int repairId, String name, String address, String number, String email, String masterName) {
		this.repairId = repairId;
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
		this.masterName = masterName;
	}

	public int getrepairId() {
		return this.repairId;
	}

	public void setrepairId(int repairId) {
		this.repairId = repairId;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return this.address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getnumber() {
		return this.number;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	public String getemail() {
		return this.email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getmasterName() {
		return this.masterName;
	}

	public void setmasterName(String name) {
		this.masterName = name;
	}

	public String toString() {
		return "CustomerVO [repairId=" + repairId + ",name=" + name + ",address=" + address + ",number=" + number
				+ ",email=" + email + ",masterName=" + masterName;
	}
}

class RequestVO {
	private int requestId;
	private int carId;
	private int repairId;
	private int compId;
	private int driveLicenseId;
	private String requestHistory;
	private String requestDate;
	private int requestFee;
	private String deadline;
	private String additionalRequest;

	RequestVO(int requestId, int carId, int repairId, int compId, int driveLicenseId, String requestHistory,
			String requestDate, int requestFee, String deadline, String additionalRequest) {
		this.requestId = requestId;
		this.carId = carId;
		this.compId = compId;
		this.repairId = repairId;
		this.driveLicenseId = driveLicenseId;
		this.requestHistory = requestHistory;
		this.requestDate = requestDate;
		this.requestFee = requestFee;
		this.deadline = deadline;
		this.additionalRequest = additionalRequest;
	}// constructor

	public int getRequestId() {
		return requestId;
	}

	public int getCarId() {
		return carId;
	}

	public int getCompId() {
		return compId;
	}

	public int getRepairId() {
		return repairId;
	}

	public int getDriveLicenseId() {
		return driveLicenseId;
	}

	public String getRequestHistory() {
		return requestHistory;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public int getRequestFee() {
		return requestFee;
	}

	public String getDeadline() {
		return deadline;
	}

	public String getAdditionalRequest() {
		return additionalRequest;
	}

	// getter
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public void setRepairId(int repairId) {
		this.repairId = repairId;
	}

	public void setDriveLicenseId(int driveLicenseId) {
		this.driveLicenseId = driveLicenseId;
	}

	public void setRequestHistory(String requestHistory) {
		this.requestHistory = requestHistory;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public void setRequestFee(int requestFee) {
		this.requestFee = requestFee;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public void setAdditionalRequest(String additionalRequest) {
		this.additionalRequest = additionalRequest;
	}
	// setter

	@Override
	public String toString() {
		return "RequestVo [" + requestId + carId + compId + repairId + driveLicenseId + requestHistory + requestDate
				+ requestFee + deadline + additionalRequest + "]";
	}
}

class CustomerDAO {
	private Connection conn = DatabaseConnect.getConnection();

	public ArrayList<CustomerVO> selectCustomer(String select, String condition) {
		String sql = "select " + select + " from Customer";
		if (!(condition.equals("")))
			sql += (" where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<CustomerVO> arrCustomerVO = new ArrayList<CustomerVO>();

		try {
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				CustomerVO tempCustomerVO = new CustomerVO(rs.getInt("driveLicenseId"), rs.getString("name"),
						rs.getString("address"), rs.getString("num"), rs.getString("email"), rs.getString("beforeUsed"),
						rs.getString("beforeUsedCar"));
				arrCustomerVO.add(tempCustomerVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrCustomerVO;
	}// select
}// CustomerDAO

class CompanyDAO {
	private Connection conn = DatabaseConnect.getConnection();

	public ArrayList<CompanyVO> selectCompany(String select, String condition) {
		String sql = "select " + select + " from Company";
		if (!(condition.equals("")))
			sql += (" where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<CompanyVO> arrCompanyVO = new ArrayList<CompanyVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				CompanyVO tempCompanyVO = new CompanyVO(rs.getInt("compId"), rs.getString("name"),
						rs.getString("address"), rs.getString("num"), rs.getString("masterName"),
						rs.getString("email"));
				arrCompanyVO.add(tempCompanyVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrCompanyVO;
	}// select

	public void insertCompany(int compId, String name, String address, String number, String email, String masterName) {

		String sql = "insert into Company values (?,?,?,?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, compId);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, number);
			pstmt.setString(5, masterName);
			pstmt.setString(6, email);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// insert
}// CompanyDAO

class CarDAO {
	private Connection conn = DatabaseConnect.getConnection();;

	public ArrayList<CarVO> selectCar(String select, String condition) {
		String sql = "select " + select + " from Car";
		if (!condition.equals(""))
			sql += (" where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<CarVO> arrCarVO = new ArrayList<CarVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				CarVO tempCarVO = new CarVO(rs.getInt("carId"), rs.getString("name"), rs.getString("carNum"),rs.getInt("carMember"), 
						rs.getString("carImage"),rs.getInt("rentFee"), rs.getInt("compId"), 
						 rs.getString("regiDate"),
						rs.getString("details"));
				arrCarVO.add(tempCarVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrCarVO;
	}// select
}// CarDAO

class RequestDAO {
	private Connection conn = DatabaseConnect.getConnection();;

	public ArrayList<RequestVO> selectRequest(String select, String condition) {
		String sql = "select " + select + " from Request";
		if (!(condition.equals("")))
			sql += (" where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<RequestVO> arrRequestVO = new ArrayList<RequestVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				RequestVO tempRequestVO = new RequestVO(rs.getInt("requestId"), rs.getInt("carId"), rs.getInt("compId"),
						rs.getInt("repairId"), rs.getInt("driveLicenseId"), rs.getString("requestHistory"),
						rs.getString("requestDate"), rs.getInt("requestFee"), rs.getString("deadline"),
						rs.getString("additionalRequest"));
				arrRequestVO.add(tempRequestVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrRequestVO;
	}// select
}// RequestDAO

class RepairDAO {
	private Connection conn = DatabaseConnect.getConnection();;

	public ArrayList<RepairVO> selectRepair(String select, String condition) {
		String sql = "select" + select + "from Repair";

		if (!(condition.equals("")))
			sql += ("where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<RepairVO> arrRepairVO = new ArrayList<RepairVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				RepairVO tempRepairVO = new RepairVO(rs.getInt("repairId"), rs.getString("name"),
						rs.getString("address"), rs.getString("num"), rs.getString("masterName"),
						rs.getString("email"));
				arrRepairVO.add(tempRepairVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrRepairVO;
	}// select
}// RepairDAO

class RentDAO {
	private Connection conn = DatabaseConnect.getConnection();;

	public ArrayList<RentVO> selectRent(String select, String condition) {
		String sql = "select " + select + " from Rent";
		if (!(condition.equals("")))
			sql += (" where " + condition);

		PreparedStatement pstmt = null;

		ArrayList<RentVO> arrRentVO = new ArrayList<RentVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				RentVO tempRentVO = new RentVO(rs.getInt("rentId"), rs.getInt("driveLicenseId"), rs.getInt("carId"),
						rs.getInt("compId"), rs.getString("startDate"), rs.getInt("totalDate"), rs.getInt("fee"),
						rs.getString("deadline"), rs.getString("additionalHistory"), rs.getInt("additionalFee"));
				arrRentVO.add(tempRentVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrRentVO;
	}// select

	public void updateRent(String fee, String condition) {

		String sql = "update Rent set fee=" + fee;
		if (!(condition.equals("")))
			sql += " where rentId=" + condition;

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// update

	public void deleteRent(String rentId) {
		String sql = "delete from Rent";

		if (!(rentId.equals(""))) {
			sql += " where rentId =" + rentId; // where\ufffd\ufffd
		}
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// delete
}// RentDAO

class ShowAll extends JPanel {

	private JLabel lbl;
	private JPanel Customer;
	private JPanel Car;
	private JPanel Company;
	private JPanel Rent;
	private JPanel Repair;
	private JPanel Request;
	
	
	JScrollPane Customerscrollpane;
	JScrollPane Carscrollpane;
	JScrollPane Companyscrollpane;
	JScrollPane Rentscrollpane;
	JScrollPane Repairscrollpane;
	JScrollPane Requestscrollpane;

	ShowAll() {
		setPreferredSize(new Dimension(1000, 600));
		setBackground(Color.WHITE);
		
		// Customer
		Vector<String> CustomCol = new Vector<String>();
		DefaultTableModel model;
		Vector<String> row;
		JTable table;

		CustomerDAO customerDao = new CustomerDAO();
		ArrayList<CustomerVO> arrCustomerVo = new ArrayList<CustomerVO>();
		arrCustomerVo = customerDao.selectCustomer("*", "");

		CustomCol.addElement("driveLicenseId");
		CustomCol.addElement("name");
		CustomCol.addElement("address");
		CustomCol.addElement("num");
		CustomCol.addElement("email");
		CustomCol.addElement("beforeUsed");
		CustomCol.addElement("beforeUsedCar");

		model = new DefaultTableModel(CustomCol, 0);
		table = new JTable(model);

		Customerscrollpane = new JScrollPane(table);
		Customerscrollpane.setBounds(30, 10, 1000, 80);
		add(Customerscrollpane, BorderLayout.CENTER);
		System.out.println(arrCustomerVo.size());
		for (int i = 0; i < arrCustomerVo.size(); i++) {
			row = new Vector<String>();
			row.addElement(String.valueOf(arrCustomerVo.get(i).getdriveLicenseId()));
			row.addElement(arrCustomerVo.get(i).getname());
			row.addElement(arrCustomerVo.get(i).getaddress());
			row.addElement(arrCustomerVo.get(i).getnumber());
			row.addElement(arrCustomerVo.get(i).getemail());
			row.addElement(arrCustomerVo.get(i).getbeforeUsed());
			row.addElement(arrCustomerVo.get(i).getbeforeUsedCar());
			model.addRow(row);
		}

		//car
		Vector<String> CarCol = new Vector<String>();
		DefaultTableModel Carmodel;
		Vector<String> Carrow;
		JTable Cartable;
		
		CarDAO carDao = new CarDAO();
		ArrayList<CarVO> arrCarVo = new ArrayList<CarVO>();
		arrCarVo = carDao.selectCar("*", ""); 

		CarCol.addElement("carId");
		CarCol.addElement("compId");
		CarCol.addElement("name");
		CarCol.addElement("carNum");
		CarCol.addElement("carMenber");
		CarCol.addElement("rentFee");
		CarCol.addElement("regiDate");
		CarCol.addElement("details");

		Carmodel = new DefaultTableModel(CarCol, 0);
		Cartable = new JTable(Carmodel);

		Carscrollpane = new JScrollPane(Cartable);
		Carscrollpane.setBounds(30, 100, 1000, 80);
		add(Carscrollpane, BorderLayout.CENTER);
		
		for (int i = 0; i < arrCarVo.size(); i++) {
			Carrow = new Vector<String>();
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getcarId()));
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getcompId()));
			Carrow.addElement(arrCarVo.get(i).getname());
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getcarNum()));
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getcarMember()));
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getrentFee()));
			Carrow.addElement(String.valueOf(arrCarVo.get(i).getregiDate()));
			Carrow.addElement(arrCarVo.get(i).getdetails());
			Carmodel.addRow(Carrow);
		}
		
		//company
		Vector<String> CompanyCol = new Vector<String>();
		DefaultTableModel Companymodel;
		Vector<String> Companyrow;
		JTable Companytable;
		
		
		CompanyDAO companyDao = new CompanyDAO();
		ArrayList<CompanyVO> arrCompanyVo = new ArrayList<CompanyVO>();
		arrCompanyVo = companyDao.selectCompany("*", ""); 

		CompanyCol.addElement("compId");
		CompanyCol.addElement("name");
		CompanyCol.addElement("address");
		CompanyCol.addElement("number");
		CompanyCol.addElement("masterName");
		CompanyCol.addElement("email");

		Companymodel = new DefaultTableModel(CompanyCol, 0);
		Companytable = new JTable(Companymodel);

		Customerscrollpane = new JScrollPane(Companytable);
		Customerscrollpane.setBounds(30, 190, 1000, 80);
		add(Customerscrollpane, BorderLayout.CENTER);
		
		
		for (int i = 0; i < arrCompanyVo.size(); i++) {
			Companyrow = new Vector<String>();
			Companyrow.addElement(String.valueOf(arrCompanyVo.get(i).getcompId()));
			Companyrow.addElement(arrCompanyVo.get(i).getname());
			Companyrow.addElement(arrCompanyVo.get(i).getaddress());
			Companyrow.addElement(arrCompanyVo.get(i).getnumber());
			Companyrow.addElement(arrCompanyVo.get(i).getmasterName());
			Companyrow.addElement(arrCompanyVo.get(i).getemail());
			Companymodel.addRow(Companyrow);
		}
		
		//Rent
		Vector<String> RentCol = new Vector<String>();
		DefaultTableModel Rentmodel;
		Vector<String> Rentrow;
		JTable Renttable;

		RentDAO rentDao = new RentDAO();
		ArrayList<RentVO> arrRentVo = new ArrayList<RentVO>();
		arrRentVo = rentDao.selectRent("*", "");

		RentCol.addElement("rentId");
		RentCol.addElement("driveLicenseId");
		RentCol.addElement("carId");
		RentCol.addElement("compId");
		RentCol.addElement("startDate");
		RentCol.addElement("totalDate");
		RentCol.addElement("fee");
		RentCol.addElement("deadline");
		RentCol.addElement("additionalHistory");
		RentCol.addElement("additionalFee");

		Rentmodel = new DefaultTableModel(RentCol, 0);
		Renttable = new JTable(Rentmodel);

		Rentscrollpane = new JScrollPane(Renttable);
		Rentscrollpane.setBounds(30, 280, 1000, 80);
		add(Rentscrollpane, BorderLayout.CENTER);
		
		for (int i = 0; i < arrRentVo.size(); i++) {
			Rentrow = new Vector<String>();
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getRentId()));
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getDriveLicenseId()));
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getCarId()));
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getCompId()));
			Rentrow.addElement(arrRentVo.get(i).getStartDate());
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getTotalDate()));
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getFee()));
			Rentrow.addElement(arrRentVo.get(i).getDeadline());
			Rentrow.addElement(arrRentVo.get(i).getAdditionalHistory());
			Rentrow.addElement(String.valueOf(arrRentVo.get(i).getAdditionalFee()));
			Rentmodel.addRow(Rentrow);
		}
		
		//repair
		Vector<String> RepairCol = new Vector<String>();
		DefaultTableModel Repairmodel;
		Vector<String> Repairrow;
		JTable Repairtable;

		RepairDAO repairDao = new RepairDAO();
		ArrayList<RepairVO> arrRepairVo = new ArrayList<RepairVO>();
		arrRepairVo = repairDao.selectRepair("*", ""); 
		
		RepairCol.addElement("repairId");
		RepairCol.addElement("name");
		RepairCol.addElement("address");
		RepairCol.addElement("number");
		RepairCol.addElement("masterName");
		RepairCol.addElement("email");

		Repairmodel = new DefaultTableModel(RepairCol, 0);
		Repairtable = new JTable(Repairmodel);

		Repairscrollpane = new JScrollPane(Repairtable);
		Repairscrollpane.setBounds(30, 370, 1000, 80);
		add(Repairscrollpane, BorderLayout.CENTER);
		
		
		for (int i = 0; i < arrRepairVo.size(); i++) {
			Repairrow = new Vector<String>();
			Repairrow.addElement(String.valueOf(arrRepairVo.get(i).getrepairId()));
			Repairrow.addElement(arrRepairVo.get(i).getname());
			Repairrow.addElement(arrRepairVo.get(i).getaddress());
			Repairrow.addElement(arrRepairVo.get(i).getnumber());
			Repairrow.addElement(arrRepairVo.get(i).getmasterName());
			Repairrow.addElement(arrRepairVo.get(i).getemail());
			Repairmodel.addRow(Repairrow);
		}
		
		//request
		Vector<String> RequestCol = new Vector<String>();
		DefaultTableModel Requestmodel;
		Vector<String> Requestrow;
		JTable Requesttable;
		
		RequestDAO requestDao = new RequestDAO();
		ArrayList<RequestVO> arrRequestVo = new ArrayList<RequestVO>();
		arrRequestVo = requestDao.selectRequest("*", ""); 

		RequestCol.addElement("requestId");
		RequestCol.addElement("carId");
		RequestCol.addElement("compId");
		RequestCol.addElement("repairId");
		RequestCol.addElement("driveLicenseId");
		RequestCol.addElement("requestHistory");
		RequestCol.addElement("requestDate");
		RequestCol.addElement("requestFee");
		RequestCol.addElement("deadline");
		RequestCol.addElement("addtionalRequest");

		Requestmodel = new DefaultTableModel(RequestCol, 0);
		Requesttable = new JTable(Requestmodel);

		Requestscrollpane = new JScrollPane(Requesttable);
	 	Requestscrollpane.setBounds(30, 460, 1000, 80);
	  add(Requestscrollpane, BorderLayout.CENTER);
		
		
		for (int i = 0; i < arrRequestVo.size(); i++) {
			Requestrow = new Vector<String>();
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getRequestId()));
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getCarId()));
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getCompId()));
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getRepairId()));
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getDriveLicenseId()));
			Requestrow.addElement(arrRequestVo.get(i).getRequestHistory());
			Requestrow.addElement(arrRequestVo.get(i).getRequestDate());
			Requestrow.addElement(String.valueOf(arrRequestVo.get(i).getRequestFee()));
			Requestrow.addElement(arrRequestVo.get(i).getDeadline());
			Requestrow.addElement(arrRequestVo.get(i).getAdditionalRequest());
			Requestmodel.addRow(Requestrow);
		}

		

	}
}// showall


class Search extends JPanel {

	private JPanel main;
	private JPanel result;
	JScrollPane scrollpane;

	private JLabel one;
	private JLabel two;
	private JLabel three;
	private JLabel four;
	private JLabel five;

	private JButton ONE;
	private JButton TWO;
	private JButton THREE;
	private JButton FOUR;
	private JButton FIVE;

	private BtnListener btnL;

	public Search() {
		setPreferredSize(new Dimension(1000, 600));
		setBackground(Color.WHITE);

		main = new JPanel();
		main.setLayout(null);
		main.setBounds(50, 50, 1000, 150);
		add(main);

		result = new JPanel();
		result.setLayout(null);
		result.setBounds(50, 210, 1000, 400);
		add(result);

		btnL = new BtnListener();

		ONE = new JButton();
		ONE.setBounds(5, 0, 20, 20);
		ONE.addActionListener(btnL);

		TWO = new JButton();
		TWO.setBounds(5, 30, 20, 20);
		TWO.addActionListener(btnL);

		THREE = new JButton();
		THREE.setBounds(5, 60, 20, 20);
		THREE.addActionListener(btnL);

		FOUR = new JButton();
		FOUR.setBounds(5, 90, 20, 20);
		FOUR.addActionListener(btnL);

		FIVE = new JButton();
		FIVE.setBounds(5, 120, 20, 20);
		FIVE.addActionListener(btnL);

		one = new JLabel(
				"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd \ufffd\ufffd\ufffd\ufffd \ufffd\u0338\ufffd \ufffd\u02fb\ufffd");
		one.setFont(new Font("", Font.BOLD, 20));
		one.setBounds(40, 0, 500, 20);
		two = new JLabel(
				"\ufffd\ubfe9\ufffd\u2c23\ufffd\ufffd 3\ufffd\u03fa\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd\ufffd \ufffd\u0338\ufffd\ufffd\ufffd \ufffd\u05bc\ufffd \ufffd\u02fb\ufffd");
		two.setFont(new Font("", Font.BOLD, 20));
		two.setBounds(40, 30, 500, 20);
		three = new JLabel(
				"\ufffd\ubfe9\u0238\ufffd\ufffd \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd \ufffd\u0338\ufffd\ufffd\ufffd JongSunHo\ufffd\ufffd \u0238\ufffd\ufffd\ufffd\ufffd \u0137\ufffd\ufffd\u012b \ufffd\u0338\ufffd \ufffd\u02fb\ufffd");
		three.setFont(new Font("", Font.BOLD, 20));
		three.setBounds(40, 60, 600, 20);
		four = new JLabel(
				"3\ufffd\ufffd\ufffd\ufffd \ufffd\ubfe9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd ?ufffd\ufffd\ufffd\ufffd\ufffd \ufffd\u02fb\ufffd");
		four.setFont(new Font("", Font.BOLD, 20));
		four.setBounds(40, 90, 500, 20);
		five = new JLabel(
				"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd \ufffd\ufffd\ufffd\ufffd \ufffd\u0338\ufffd \ufffd\u02fb\ufffd");
		five.setFont(new Font("", Font.BOLD, 20));
		five.setBounds(40, 120, 500, 20);

		main.add(one);
		main.add(two);
		main.add(three);
		main.add(four);
		main.add(five);
		main.add(ONE);
		main.add(TWO);
		main.add(THREE);
		main.add(FOUR);
		main.add(FIVE);
	} // serch()

	private Connection conn = DatabaseConnect.getConnection();;

	public void Query1() {
		Vector<String> column = new Vector<String>();
		DefaultTableModel model;
		Vector<String> row;
		JTable table;

		CustomerDAO customerDao = new CustomerDAO();
		ArrayList<CustomerVO> arrCustomerVo = new ArrayList<CustomerVO>();
		arrCustomerVo = customerDao.selectCustomer("name", "address LIKE \"%Mapogu\" ");

		column.addElement("NAME");

		model = new DefaultTableModel(column, 0);
		table = new JTable(model);

		result.removeAll();
		scrollpane = new JScrollPane(table);
		result.add(scrollpane, BorderLayout.CENTER);
		add(result);
		row = new Vector<String>();
		for (int i = 0; i < arrCustomerVo.size(); i++) {
			row.addElement(arrCustomerVo.get(i).getname());
		}
		model.addRow(row);
		result.repaint();
	}// Query1

	public void Query2() {
		Vector<String> column = new Vector<String>();
		DefaultTableModel model;
		Vector<String> row;
		JTable table;

		CustomerDAO customerDao = new CustomerDAO();
		ArrayList<CustomerVO> arrCustomerVo = new ArrayList<CustomerVO>();
		arrCustomerVo = customerDao.selectCustomer("address, name",
				"driveLicenseId IN (SELECT driveLicenseId FROM Rent WHERE totalDate <3) ");

		column.addElement("NAME");
		column.addElement("ADDRESS");

		model = new DefaultTableModel(column, 0);
		table = new JTable(model);

		result.removeAll();
		scrollpane = new JScrollPane(table);
		result.add(scrollpane, BorderLayout.CENTER);
		result.add(result);
		row = new Vector<String>();
		for (int i = 0; i < arrCustomerVo.size(); i++) {
			row.addElement(arrCustomerVo.get(i).getname());
			row.addElement(arrCustomerVo.get(i).getaddress());
		}
		model.addRow(row);
		result.repaint();
	}// Query2

	public void Query3() {
		Vector<String> column = new Vector<String>();
		DefaultTableModel model;
		Vector<String> row;
		JTable table;

		CarDAO carDao = new CarDAO();
		ArrayList<CarVO> arrCarVo = new ArrayList<CarVO>();
		arrCarVo = carDao.selectCar("name",
				"compId IN (SELECT compId FROM Company WHERE masterName = \\\"JongSunHo\\\") ");

		column.addElement("Car Name");

		model = new DefaultTableModel(column, 0);
		table = new JTable(model);

		result.removeAll();
		scrollpane = new JScrollPane(table);
		result.add(scrollpane, BorderLayout.CENTER);
		add(result);
		row = new Vector<String>();
		for (int i = 0; i < arrCarVo.size(); i++) {
			row.addElement(arrCarVo.get(i).getname());
		}
		model.addRow(row);
		result.repaint();
	}// Query3

	public void Query4() {
		Vector<String> column = new Vector<String>();
		DefaultTableModel model;
		Vector<String> row;
		JTable table;

		RentDAO rentDao = new RentDAO();
		ArrayList<RentVO> arrRentVo = new ArrayList<RentVO>();
		arrRentVo = rentDao.selectRent("totalDate, fee", "GROUP BY totalDate HAVING totalDate =3");

		column.addElement("RentDate");
		column.addElement("Fee");

		model = new DefaultTableModel(column, 0);
		table = new JTable(model);

		result.removeAll();
		scrollpane = new JScrollPane(table);
		result.add(scrollpane, BorderLayout.CENTER);
		add(result);
		row = new Vector<String>();
		for (int i = 0; i < arrRentVo.size(); i++) {
			row.addElement(String.valueOf(arrRentVo.get(i).getTotalDate()));
			row.addElement(String.valueOf(arrRentVo.get(i).getFee()));
		}
		model.addRow(row);
		result.repaint();
	}// Query4

	public void Query5() {
		String sql;
		String header[] = { "\ufffd\u0338\ufffd", "\ufffd\ubfe9\ufffd\ufffd\ufffd\ufffd" };
		String contents[][];
		JTable table = new JTable();

		sql = "SELECT name, requestHistory FROM Car, Request WHERE Car.carId = Request.carId GROUP BY name HAVING requestHistory = \"tire\";";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				//
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		JLabel lbl;
		lbl = new JLabel("five");
		lbl.setBounds(10, 10, 100, 50);
		result.removeAll();
		result.add(lbl);
		result.add(table);
		result.repaint();
	}// Query5

	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object obj = event.getSource();
			if (obj == ONE) {
				Query1();
			}
			if (obj == TWO) {
				Query2();
			}
			if (obj == THREE) {
				Query3();
			}
			if (obj == FOUR) {
				Query4();
			}
			if (obj == FIVE) {
				Query5();
			}
		}
	}// BtnListener
}// Search

class PrimaryPanel extends JPanel {

	private AddDeleteUpdate addDeleteUpdatePanel;
	private Search searchPanel;
	private ShowAll showallPanel;

	private JButton showallBtn;
	private JButton sqlBtn;
	private JButton Search;
	private JButton INIT;

	private BtnListener btnL;

	public PrimaryPanel() {
		setPreferredSize(new Dimension(1200, 800));
		setLayout(null);
		setBounds(0, 0, 1200, 800);
		setBackground(Color.LIGHT_GRAY);

		btnL = new BtnListener();

		Search = new JButton("DATA MANAGEMENT");
		Search.setLayout(null);
		Search.setBounds(50, 50, 150, 50);
		Search.addActionListener(btnL);
		add(Search);

		sqlBtn = new JButton("SEARCH"); // sqlPanel
		sqlBtn.setLayout(null);
		sqlBtn.setBounds(205, 50, 110, 50);
		sqlBtn.addActionListener(btnL);
		add(sqlBtn);

		showallBtn = new JButton("SHOW");
		showallBtn.setLayout(null);
		showallBtn.setBounds(320, 50, 100, 50);
		showallBtn.addActionListener(btnL);
		add(showallBtn);

		INIT = new JButton("INIT");
		INIT.setLayout(null);
		INIT.setBounds(1050, 50, 100, 50);
		INIT.addActionListener(btnL);
		add(INIT);

		addDeleteUpdatePanel = new AddDeleteUpdate();
		addDeleteUpdatePanel.setLayout(null);
		addDeleteUpdatePanel.setBounds(50, 100, 1100, 650);
		add(addDeleteUpdatePanel);
		addDeleteUpdatePanel.setVisible(true);

		searchPanel = new Search();
		searchPanel.setLayout(null);
		searchPanel.setBounds(50, 100, 1100, 650);
		add(searchPanel);
		searchPanel.setVisible(false);

		showallPanel = new ShowAll();
		showallPanel.setLayout(null);
		showallPanel.setBounds(50, 100, 1100, 650);
		add(showallPanel);
		showallPanel.setVisible(false);

	}// PrimaryPanel()

	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object obj = event.getSource();
			if (obj == Search) {
				searchPanel.setVisible(false);
				addDeleteUpdatePanel.setVisible(true);
				showallPanel.setVisible(false);
			}
			if (obj == sqlBtn) {
				searchPanel.setVisible(true);
				addDeleteUpdatePanel.setVisible(false);
				showallPanel.setVisible(false);
			}
			if (obj == showallBtn) {
				searchPanel.setVisible(false);
				addDeleteUpdatePanel.setVisible(false);
				showallPanel.setVisible(true);
			}
			if (obj == INIT) {
				JOptionPane.showMessageDialog(null,
						"\ufffd\u02b1\ufffd\u022d \ufffd\u03fd?u06bd\ufffd\ufffd\u03f1\ufffd?");
			}
		}
	}// BtnListener
}// PrimaryPanel

class AddDeleteUpdate extends JPanel {

	private JPanel addPanel, deletePanel, updatePanel;

	private JLabel addLbl, deleteLbl, updateLbl;
	private JLabel compIdLbl, compNameLbl, compAddressLbl, compNumberLbl, masterNameLbl, compEmailLbl;
	private JLabel rentIdLbl;
	private JLabel RentIdLbl, changeFeeLbl;

	private JTextField compIdTf, compNameTf, compAddressTf, compNumberTf, masterNameTf, compEmailTf;
	private JTextField rentTf;
	private JTextField rentIdTf, changeFeeTf;

	private JButton addBtn, deleteBtn, updateBtn;
	private BtnListener btnL;

	public AddDeleteUpdate() {
		setPreferredSize(new Dimension(1000, 600));
		setBackground(Color.WHITE);

		btnL = new BtnListener();

		// insert to company
		addPanel = new JPanel();
		addPanel.setLayout(null);
		addPanel.setBounds(50, 50, 1000, 200);
		add(addPanel);

		addLbl = new JLabel("ADD TO COMPANY TABLE");
		addLbl.setFont(new Font("", Font.BOLD, 20));
		addLbl.setLayout(null);
		addLbl.setBounds(10, 20, 300, 20);
		addPanel.add(addLbl);

		addBtn = new JButton("ADD");
		addBtn.setFont(new Font("", Font.PLAIN, 15));
		addBtn.setLayout(null);
		addBtn.setBounds(860, 170, 100, 20);
		addBtn.addMouseListener(btnL);
		addPanel.add(addBtn);

		compIdLbl = new JLabel("ID");
		compIdLbl.setFont(new Font("", Font.PLAIN, 15));
		compIdLbl.setLayout(null);
		compIdLbl.setBounds(10, 70, 100, 30);
		addPanel.add(compIdLbl);

		compNameLbl = new JLabel("NAME");
		compNameLbl.setFont(new Font("", Font.PLAIN, 15));
		compNameLbl.setLayout(null);
		compNameLbl.setBounds(310, 70, 100, 30);
		addPanel.add(compNameLbl);

		compAddressLbl = new JLabel("ADDRESS");
		compAddressLbl.setFont(new Font("", Font.PLAIN, 15));
		compAddressLbl.setLayout(null);
		compAddressLbl.setBounds(660, 70, 100, 30);
		addPanel.add(compAddressLbl);

		compNumberLbl = new JLabel("NUMBER");
		compNumberLbl.setFont(new Font("", Font.PLAIN, 15));
		compNumberLbl.setLayout(null);
		compNumberLbl.setBounds(10, 120, 100, 30);
		addPanel.add(compNumberLbl);

		masterNameLbl = new JLabel("MASTERNAME");
		masterNameLbl.setFont(new Font("", Font.PLAIN, 15));
		masterNameLbl.setLayout(null);
		masterNameLbl.setBounds(310, 120, 100, 30);
		addPanel.add(masterNameLbl);

		compEmailLbl = new JLabel("EMAIL");
		compEmailLbl.setFont(new Font("", Font.PLAIN, 15));
		compEmailLbl.setLayout(null);
		compEmailLbl.setBounds(660, 120, 100, 30);
		addPanel.add(compEmailLbl);

		compIdTf = new JTextField();
		compIdTf.setLayout(null);
		compIdTf.setBounds(110, 70, 120, 30);
		addPanel.add(compIdTf);

		compNameTf = new JTextField();
		compNameTf.setLayout(null);
		compNameTf.setBounds(460, 70, 120, 30);
		addPanel.add(compNameTf);

		compAddressTf = new JTextField();
		compAddressTf.setLayout(null);
		compAddressTf.setBounds(760, 70, 200, 30);
		addPanel.add(compAddressTf);

		compNumberTf = new JTextField();
		compNumberTf.setLayout(null);
		compNumberTf.setBounds(110, 120, 120, 30);
		addPanel.add(compNumberTf);

		masterNameTf = new JTextField();
		masterNameTf.setLayout(null);
		masterNameTf.setBounds(460, 120, 120, 30);
		addPanel.add(masterNameTf);

		compEmailTf = new JTextField();
		compEmailTf.setLayout(null);
		compEmailTf.setBounds(760, 120, 200, 30);
		addPanel.add(compEmailTf);

		// delete from rent
		deletePanel = new JPanel();
		deletePanel.setLayout(null);
		deletePanel.setBounds(50, 270, 1000, 110);
		add(deletePanel);

		deleteLbl = new JLabel("DELETE FROM RENT TABLE");
		deleteLbl.setFont(new Font("", Font.BOLD, 20));
		deleteLbl.setLayout(null);
		deleteLbl.setBounds(10, 20, 300, 20);
		deletePanel.add(deleteLbl);

		deleteBtn = new JButton("DELETE");
		deleteBtn.setFont(new Font("", Font.PLAIN, 15));
		deleteBtn.setLayout(null);
		deleteBtn.setBounds(860, 70, 100, 20);
		deleteBtn.addMouseListener(btnL);
		deletePanel.add(deleteBtn);

		rentIdLbl = new JLabel("ID");
		rentIdLbl.setFont(new Font("", Font.PLAIN, 15));
		rentIdLbl.setLayout(null);
		rentIdLbl.setBounds(10, 70, 100, 30);
		deletePanel.add(rentIdLbl);

		rentTf = new JTextField();
		rentTf.setLayout(null);
		rentTf.setBounds(70, 70, 100, 30);
		deletePanel.add(rentTf);

		// update from rent
		updatePanel = new JPanel();
		updatePanel.setLayout(null);
		updatePanel.setBounds(50, 400, 1000, 220);
		add(updatePanel);

		updateLbl = new JLabel("UPDATE Rent");
		updateLbl.setFont(new Font("", Font.BOLD, 20));
		updateLbl.setLayout(null);
		updateLbl.setBounds(10, 20, 250, 20);
		updatePanel.add(updateLbl);

		updateBtn = new JButton("UPDATE");
		updateBtn.setFont(new Font("", Font.PLAIN, 15));
		updateBtn.setLayout(null);
		updateBtn.setBounds(860, 170, 100, 20);
		updateBtn.addMouseListener(btnL);
		updatePanel.add(updateBtn);

		RentIdLbl = new JLabel("\ufffd\ubfe9\ufffd\ufffd\u0223");
		RentIdLbl.setFont(new Font("", Font.PLAIN, 15));
		RentIdLbl.setLayout(null);
		RentIdLbl.setBounds(10, 70, 150, 30);
		updatePanel.add(RentIdLbl);

		changeFeeLbl = new JLabel("\ufffd\ufffd\ufffd\ufffd \ufffd\ufffd\ufffd");
		changeFeeLbl.setFont(new Font("", Font.PLAIN, 15));
		changeFeeLbl.setLayout(null);
		changeFeeLbl.setBounds(660, 70, 100, 30);
		updatePanel.add(changeFeeLbl);

		rentIdTf = new JTextField();
		rentIdTf.setLayout(null);
		rentIdTf.setBounds(110, 70, 200, 30);
		updatePanel.add(rentIdTf);

		changeFeeTf = new JTextField();
		changeFeeTf.setLayout(null);
		changeFeeTf.setBounds(760, 70, 200, 30);
		updatePanel.add(changeFeeTf);

	}// AddDeleteUpdate()

	private class BtnListener implements MouseListener {
		public void mouseClicked(MouseEvent event) {
		}

		public void mousePressed(MouseEvent event) {
		}

		public void mouseReleased(MouseEvent event) {
			JButton btn = (JButton) event.getSource();

			if (btn == addBtn) {
				// company table
				CompanyDAO comp = new CompanyDAO();
				int compId = Integer.parseInt(compIdLbl.getText());
				String compName = compNameLbl.getText();
				String compAddress = compAddressLbl.getText();
				String compNumber = compNumberLbl.getText();
				String masterName = masterNameLbl.getText();
				String compEmail = compEmailLbl.getText();

				comp.insertCompany(compId, compName, compAddress, compNumber, compEmail, masterName);
			}
			if (btn == deleteBtn) {
				RentDAO rent = new RentDAO();
				String rentId = rentIdLbl.getText();

				rent.deleteRent(rentId);
			}
			if (btn == updateBtn) {
				RentDAO rent = new RentDAO();
				String rentId = rentIdTf.getText();
				String chargeFee = changeFeeTf.getText();

				rent.updateRent(chargeFee, rentId);
			}
		}

		public void mouseEntered(MouseEvent event) {
		}

		public void mouseExited(MouseEvent event) {
		}
	}// BtnMenuListener
}// AddDeleteUpdate

class DatabaseConnect {
	private static final String USERNAME = "s16011008";// \ufffd\ufffd\ufffd\ufffd\ufffd\u063e\u07f5\ufffd!!
	private static final String PASSWORD = "011031";// \ufffd\ufffd\ufffd\ufffd\ufffd\u063e\u07f5\ufffd!!
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";

	public static Connection dbConn;

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			System.out.println("DB Connection OK!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB Driver Error!");
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("DB Connection Error");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unkonwn Error!");
		}
		return conn;
	}
}

public class App extends JFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame("DATABASE PROJECT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		PrimaryPanel primary = new PrimaryPanel();
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}