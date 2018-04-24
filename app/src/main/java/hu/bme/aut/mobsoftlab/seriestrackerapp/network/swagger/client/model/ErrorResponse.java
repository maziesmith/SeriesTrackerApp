/*
 * OMDb API
 * The OMDb API is a RESTful web service to obtain movie information, all content and images on the site are contributed and maintained by our users.
 *
 * OpenAPI spec version: 1.0
 * Contact: bfritz@fadingsignal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package hu.bme.aut.mobsoftlab.seriestrackerapp.network.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorResponse
 */
public class ErrorResponse {
    @SerializedName("Response")
    private Boolean response = null;

    @SerializedName("Error")
    private String error = null;

    public ErrorResponse response(Boolean response) {
        this.response = response;
        return this;
    }

    /**
     * Get response
     *
     * @return response
     **/
    @ApiModelProperty(value = "")
    public Boolean isResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public ErrorResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @ApiModelProperty(value = "")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");

        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

