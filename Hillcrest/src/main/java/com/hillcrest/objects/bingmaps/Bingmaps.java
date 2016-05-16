
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
    "authenticationResultCode",
    "brandLogoUri",
    "copyright",
    "resourceSets",
    "statusCode",
    "statusDescription",
    "traceId"
})
public class Bingmaps {

    @JsonProperty("authenticationResultCode")
    private String authenticationResultCode;
    @JsonProperty("brandLogoUri")
    private String brandLogoUri;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("resourceSets")
    private List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
    @JsonProperty("statusCode")
    private Integer statusCode;
    @JsonProperty("statusDescription")
    private String statusDescription;
    @JsonProperty("traceId")
    private String traceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The authenticationResultCode
     */
    @JsonProperty("authenticationResultCode")
    public String getAuthenticationResultCode() {
        return authenticationResultCode;
    }

    /**
     * 
     * @param authenticationResultCode
     *     The authenticationResultCode
     */
    @JsonProperty("authenticationResultCode")
    public void setAuthenticationResultCode(String authenticationResultCode) {
        this.authenticationResultCode = authenticationResultCode;
    }

    /**
     * 
     * @return
     *     The brandLogoUri
     */
    @JsonProperty("brandLogoUri")
    public String getBrandLogoUri() {
        return brandLogoUri;
    }

    /**
     * 
     * @param brandLogoUri
     *     The brandLogoUri
     */
    @JsonProperty("brandLogoUri")
    public void setBrandLogoUri(String brandLogoUri) {
        this.brandLogoUri = brandLogoUri;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The resourceSets
     */
    @JsonProperty("resourceSets")
    public List<ResourceSet> getResourceSets() {
        return resourceSets;
    }

    /**
     * 
     * @param resourceSets
     *     The resourceSets
     */
    @JsonProperty("resourceSets")
    public void setResourceSets(List<ResourceSet> resourceSets) {
        this.resourceSets = resourceSets;
    }

    /**
     * 
     * @return
     *     The statusCode
     */
    @JsonProperty("statusCode")
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The statusCode
     */
    @JsonProperty("statusCode")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The statusDescription
     */
    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * 
     * @param statusDescription
     *     The statusDescription
     */
    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * 
     * @return
     *     The traceId
     */
    @JsonProperty("traceId")
    public String getTraceId() {
        return traceId;
    }

    /**
     * 
     * @param traceId
     *     The traceId
     */
    @JsonProperty("traceId")
    public void setTraceId(String traceId) {
        this.traceId = traceId;
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
