
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
    "type",
    "coordinates",
    "calculationMethod",
    "usageTypes"
})
public class GeocodePoint {

    @JsonProperty("type")
    private String type;
    @JsonProperty("coordinates")
    private List<Double> coordinates = new ArrayList<Double>();
    @JsonProperty("calculationMethod")
    private String calculationMethod;
    @JsonProperty("usageTypes")
    private List<String> usageTypes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public List<Double> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The calculationMethod
     */
    @JsonProperty("calculationMethod")
    public String getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * 
     * @param calculationMethod
     *     The calculationMethod
     */
    @JsonProperty("calculationMethod")
    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    /**
     * 
     * @return
     *     The usageTypes
     */
    @JsonProperty("usageTypes")
    public List<String> getUsageTypes() {
        return usageTypes;
    }

    /**
     * 
     * @param usageTypes
     *     The usageTypes
     */
    @JsonProperty("usageTypes")
    public void setUsageTypes(List<String> usageTypes) {
        this.usageTypes = usageTypes;
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
