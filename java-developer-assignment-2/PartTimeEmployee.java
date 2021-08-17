import java.util.Date;

public class PartTimeEmployee extends Employee {
    private boolean isPartTime = true;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(boolean managerFlag, String name, Date dateHired, int id) {
        super(managerFlag, name, dateHired, id);
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    @Override
    public String toString() {
        return "Part Time Employee [dateHired=" + getDateHired() + ", id=" + getId() + ", managerFlag=" + isManager() + ", name="
                + getName() + ", isPartTime=" + isPartTime() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PartTimeEmployee other = (PartTimeEmployee) obj;
        if (getDateHired() == null) {
            if (other.getDateHired() != null)
                return false;
        } else if (!getDateHired().equals(other.getDateHired()))
            return false;
        if (getId() != other.getId())
            return false;
        if (isManager() != other.isManager())
            return false;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        if (isPartTime() != other.isPartTime())
            return false;
        return true;
    }

}
