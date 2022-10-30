package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    private int id;
    private static int nextId = 1;

    public Job() {
        id = nextId;
        nextId++;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId() && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        if (this.getName().equals("")) {
            this.setName("Data not available");
        }
        if (this.getEmployer().getValue().equals("")) {
            this.employer.setValue("Data not available");
        }
        if (this.getLocation().getValue().equals("")) {
            this.location.setValue("Data not available");
        }
        if (this.getPositionType().getValue().equals("")) {
            this.positionType.setValue("Data not available");
        }
        if (this.coreCompetency.getValue().equals("")) {
            this.coreCompetency.setValue("Data not available");
        }
        return
                        "\nID: " + this.getId() + "\n" +
                        "Name: " + this.getName() + "\n" +
                        "Employer: " + this.getEmployer().getValue() + "\n" +
                        "Location: " + this.getLocation().getValue() + "\n" +
                        "Position Type: " + this.getPositionType().getValue() + "\n" +
                        "Core Competency: " + this.getCoreCompetency().getValue() + "\n";
    }
}
