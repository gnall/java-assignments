import java.util.Date;

public class Employee {
    private boolean managerFlag = false;
    private String name = "";
    private Date dateHired;
    private int id;

    public Employee() {
    }

    public Employee(boolean managerFlag, String name, Date dateHired, int id) {
        this.managerFlag = managerFlag;
        this.name = name;
        this.dateHired = dateHired;
        this.id = id;
    }

    public boolean isManager() {
        return managerFlag;
    }

    public void setManagerFlag(boolean managerFlag) {
        this.managerFlag = managerFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [dateHired=" + dateHired + ", id=" + id + ", managerFlag=" + managerFlag + ", name=" + name
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (dateHired == null) {
            if (other.dateHired != null)
                return false;
        } else if (!dateHired.equals(other.dateHired))
            return false;
        if (id != other.id)
            return false;
        if (managerFlag != other.managerFlag)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
