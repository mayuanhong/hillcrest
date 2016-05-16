
package com.hillcrest.objects.bingmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "__type",
    "bbox",
    "name",
    "point",
    "address",
    "confidence",
    "entityType",
    "geocodePoints",
    "matchCodes"
})
public class Resource {

    @JsonProperty("__type")
    private String Type;
    @JsonProperty("bbox")
    private List<Double> bbox = new ArrayList<Double>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("point")
    private Point point;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("confidence")
    private String confidence;
    @JsonProperty("entityType")
    private String entityType;
    @JsonProperty("geocodePoints")
    private List<GeocodePoint> geocodePoints = new ArrayList<GeocodePoint>();
    @JsonProperty("matchCodes")
    private List<String> matchCodes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("__type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The __type
     */
    @JsonProperty("__type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The bbox
     */
    @JsonProperty("bbox")
    public List<Double> getBbox() {
        return bbox;
    }

    /**
     * 
     * @param bbox
     *     The bbox
     */
    @JsonProperty("bbox")
    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The point
     */
    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    /**
     * 
     * @param point
     *     The point
     */
    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The confidence
     */
    @JsonProperty("confidence")
    public String getConfidence() {
        return confidence;
    }

    /**
     * 
     * @param confidence
     *     The confidence
     */
    @JsonProperty("confidence")
    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    /**
     * 
     * @return
     *     The entityType
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * 
     * @param entityType
     *     The entityType
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * 
     * @return
     *     The geocodePoints
     */
    @JsonProperty("geocodePoints")
    public List<GeocodePoint> getGeocodePoints() {
        return geocodePoints;
    }

    /**
     * 
     * @param geocodePoints
     *     The geocodePoints
     */
    @JsonProperty("geocodePoints")
    public void setGeocodePoints(List<GeocodePoint> geocodePoints) {
        this.geocodePoints = geocodePoints;
    }

    /**
     * 
     * @return
     *     The matchCodes
     */
    @JsonProperty("matchCodes")
    public List<String> getMatchCodes() {
        return matchCodes;
    }

    /**
     * 
     * @param matchCodes
     *     The matchCodes
     */
    @JsonProperty("matchCodes")
    public void setMatchCodes(List<String> matchCodes) {
        this.matchCodes = matchCodes;
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
