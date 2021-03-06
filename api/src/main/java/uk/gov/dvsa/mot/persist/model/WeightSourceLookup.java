package uk.gov.dvsa.mot.persist.model;

import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the weight_source_lookup database table.
 */
public class WeightSourceLookup implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String code;
    private int createdBy;
    private Date createdOn;
    private String description;
    private int displayOrder;
    private int lastUpdatedBy;
    private Date lastUpdatedOn;
    private String name;
    private int version;

    public WeightSourceLookup() {

    }

    public int getId() {

        return this.id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCode() {

        return this.code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public int getCreatedBy() {

        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {

        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {

        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {

        this.createdOn = createdOn;
    }

    public String getDescription() {

        return this.description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getDisplayOrder() {

        return this.displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {

        this.displayOrder = displayOrder;
    }

    public int getLastUpdatedBy() {

        return this.lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {

        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedOn() {

        return this.lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {

        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getVersion() {

        return this.version;
    }

    public void setVersion(int version) {

        this.version = version;
    }
}