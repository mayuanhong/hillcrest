
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
    "estimatedTotal",
    "resources"
})
public class ResourceSet {

    @JsonProperty("estimatedTotal")
    private Integer estimatedTotal;
    @JsonProperty("resources")
    private List<Resource> resources = new ArrayList<Resource>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The estimatedTotal
     */
    @JsonProperty("estimatedTotal")
    public Integer getEstimatedTotal() {
        return estimatedTotal;
    }

    /**
     * 
     * @param estimatedTotal
     *     The estimatedTotal
     */
    @JsonProperty("estimatedTotal")
    public void setEstimatedTotal(Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    /**
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
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
