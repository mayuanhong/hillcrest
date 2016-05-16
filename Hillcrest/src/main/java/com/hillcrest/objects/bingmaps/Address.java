
package com.hillcrest.objects.bingmaps;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "addressLine",
    "adminDistrict",
    "adminDistrict2",
    "countryRegion",
    "formattedAddress",
    "locality",
    "postalCode"
})
public class Address {

    @JsonProperty("addressLine")
    private String addressLine;
    @JsonProperty("adminDistrict")
    private String adminDistrict;
    @JsonProperty("adminDistrict2")
    private String adminDistrict2;
    @JsonProperty("countryRegion")
    private String countryRegion;
    @JsonProperty("formattedAddress")
    private String formattedAddress;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The addressLine
     */
    @JsonProperty("addressLine")
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * 
     * @param addressLine
     *     The addressLine
     */
    @JsonProperty("addressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * 
     * @return
     *     The adminDistrict
     */
    @JsonProperty("adminDistrict")
    public String getAdminDistrict() {
        return adminDistrict;
    }

    /**
     * 
     * @param adminDistrict
     *     The adminDistrict
     */
    @JsonProperty("adminDistrict")
    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    /**
     * 
     * @return
     *     The adminDistrict2
     */
    @JsonProperty("adminDistrict2")
    public String getAdminDistrict2() {
        return adminDistrict2;
    }

    /**
     * 
     * @param adminDistrict2
     *     The adminDistrict2
     */
    @JsonProperty("adminDistrict2")
    public void setAdminDistrict2(String adminDistrict2) {
        this.adminDistrict2 = adminDistrict2;
    }

    /**
     * 
     * @return
     *     The countryRegion
     */
    @JsonProperty("countryRegion")
    public String getCountryRegion() {
        return countryRegion;
    }

    /**
     * 
     * @param countryRegion
     *     The countryRegion
     */
    @JsonProperty("countryRegion")
    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    /**
     * 
     * @return
     *     The formattedAddress
     */
    @JsonProperty("formattedAddress")
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * 
     * @param formattedAddress
     *     The formattedAddress
     */
    @JsonProperty("formattedAddress")
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /**
     * 
     * @return
     *     The locality
     */
    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    /**
     * 
     * @param locality
     *     The locality
     */
    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postalCode
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
