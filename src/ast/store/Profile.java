package ast.store;

import java.util.Date;

public class Profile {
	
	private String username, password, firstName, surname, gender, bio, avatar;
	private String city, country;
	private String interest1, interest2, interest3;
	private int TTP, TTPJ, LTP, SPL;
	private int LTPINT1, LTPINT2, LTPINT3, LTPNEWLOC, LTPEVENT, LTPWEATHER, LTPNEWS, LTPFLR, LTPPHOTO;
	private Date dob;
	
	
	public Profile() {}	
	
	public void setUsername(String _username)
	{
		username = _username;
	}
	public void setPassword(String _password)
	{
		password = _password;
	}
	public void setFirstName(String _firstName)
	{
		firstName = _firstName;
	}
	public void setSurname(String _surname)
	{
		surname = _surname;
	}
	public void setGender(String _gender)
	{
		gender = _gender;
	}
	public void setBio(String _bio)
	{
		bio = _bio;
	}
	public void setAvatar(String _avatar)
	{
		avatar = _avatar;
	}
	public void setCity(String _city)
	{
		city = _city;
	}
	public void setCountry(String _country)
	{
		country = _country;
	}
	public void setInterest1(String _interest)
	{
		interest1 = _interest;
	}
	public void setInterest2(String _interest)
	{
		interest2 = _interest;
	}
	public void setInterest3(String _interest)
	{
		interest3 = _interest;
	}
	public void setTTP(int _TTP)
	{
		TTP = _TTP;
	}
	public void setTTPJ(int _TTPJ)
	{
		TTPJ = _TTPJ;
	}
	public void setLTP(int _LTP)
	{
		LTP = _LTP;
	}
	public void setSPL(int _SPL)
	{
		SPL = _SPL;
	}
	public void setLTPINT1(int _LTPINT1)
	{
		LTPINT1 = _LTPINT1;
	}
	public void setLTPINT2(int _LTPINT2)
	{
		LTPINT2 = _LTPINT2;
	}
	public void setLTPINT3(int _LTPINT3)
	{
		LTPINT3 = _LTPINT3;
	}
	public void setLTPNEWLOC(int _LTPNEWLOC)
	{
		LTPNEWLOC = _LTPNEWLOC;
	}
	public void setLTPEVENT(int _LTPEVENT)
	{
		LTPEVENT = _LTPEVENT;
	}
	public void setLTPWEATHER(int _LTPWEATHER)
	{
		LTPWEATHER = _LTPWEATHER;
	}
	public void setLTPNEWS(int _LTPNEWS)
	{
		LTPNEWS = _LTPNEWS;
	}
	public void setLTPFLR(int _LTPFLR)
	{
		LTPFLR = _LTPFLR;
	}
	public void setLTPPHOTO(int _LTPPHOTO)
	{
		LTPPHOTO = _LTPPHOTO;
	}
	
	
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getSurname()
	{
		return surname;
	}
	public Date getDOB()
	{
		return dob;
	}
	public String getGender()
	{
		return gender;
	}
	public String getBio()
	{
		return bio;
	}
	public String getAvatar()
	{
		return avatar;
	}
	public String getCity()
	{
		return city;
	}
	public String getCountry()
	{
		return country;
	}
	public String getInterest1()
	{
		return interest1;
	}
	public String getInterest2()
	{
		return interest2;
	}
	public String getInterest3()
	{
		return interest3;
	}
	public int getTTP()
	{
		return TTP;
	}
	public int getTTPJ()
	{
		return TTPJ;
	}
	public int getLTP()
	{
		return LTP;
	}
	public int getSPL()
	{
		return SPL;
	}
	public int getLTPINT1()
	{
		return LTPINT1;
	}
	public int getLTPINT2()
	{
		return LTPINT2;
	}
	public int getLTPINT3()
	{
		return LTPINT3;
	}
	public int getLTPNEWLOC()
	{
		return LTPNEWLOC;
	}
	public int getLTPEVENT()
	{
		return LTPEVENT;
	}
	public int getLTPWEATHER()
	{
		return LTPWEATHER;
	}
	public int getLTPNEWS()
	{
		return LTPNEWS;
	}
	public int getLTPFLR()
	{
		return LTPFLR;
	}
	public int getLTPPHOTO()
	{
		return LTPPHOTO;
	}
	
}
