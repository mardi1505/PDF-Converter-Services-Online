/*
 * Muhimbi PDF
 * Convert, Merge, Watermark, Secure and OCR files.
 *
 * OpenAPI spec version: 9.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.muhimbi.online.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parameters for ConvertHtml operation
 */
@ApiModel(description = "Parameters for ConvertHtml operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-17T11:28:12.598Z")
public class ConvertHtmlData {
  @SerializedName("use_async_pattern")
  private Boolean useAsyncPattern = false;

  @SerializedName("source_url_or_html")
  private String sourceUrlOrHtml = null;

  /**
   * Page orientation
   */
  public enum PageOrientationEnum {
    @SerializedName("Portrait")
    PORTRAIT("Portrait"),
    
    @SerializedName("Landscape")
    LANDSCAPE("Landscape");

    private String value;

    PageOrientationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("page_orientation")
  private PageOrientationEnum pageOrientation = PageOrientationEnum.PORTRAIT;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Authentication type
   */
  public enum AuthenticationTypeEnum {
    @SerializedName("Basic")
    BASIC("Basic");

    private String value;

    AuthenticationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authentication_type")
  private AuthenticationTypeEnum authenticationType = AuthenticationTypeEnum.BASIC;

  @SerializedName("fail_on_error")
  private Boolean failOnError = true;

  public ConvertHtmlData useAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
    return this;
  }

   /**
   * Use async behaviour for API request
   * @return useAsyncPattern
  **/
  @ApiModelProperty(example = "null", value = "Use async behaviour for API request")
  public Boolean getUseAsyncPattern() {
    return useAsyncPattern;
  }

  public void setUseAsyncPattern(Boolean useAsyncPattern) {
    this.useAsyncPattern = useAsyncPattern;
  }

  public ConvertHtmlData sourceUrlOrHtml(String sourceUrlOrHtml) {
    this.sourceUrlOrHtml = sourceUrlOrHtml;
    return this;
  }

   /**
   * HTML fragment or URL to convert
   * @return sourceUrlOrHtml
  **/
  @ApiModelProperty(example = "null", required = true, value = "HTML fragment or URL to convert")
  public String getSourceUrlOrHtml() {
    return sourceUrlOrHtml;
  }

  public void setSourceUrlOrHtml(String sourceUrlOrHtml) {
    this.sourceUrlOrHtml = sourceUrlOrHtml;
  }

  public ConvertHtmlData pageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
    return this;
  }

   /**
   * Page orientation
   * @return pageOrientation
  **/
  @ApiModelProperty(example = "null", value = "Page orientation")
  public PageOrientationEnum getPageOrientation() {
    return pageOrientation;
  }

  public void setPageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
  }

  public ConvertHtmlData username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "User name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ConvertHtmlData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConvertHtmlData authenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Authentication type
   * @return authenticationType
  **/
  @ApiModelProperty(example = "null", value = "Authentication type")
  public AuthenticationTypeEnum getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
  }

  public ConvertHtmlData failOnError(Boolean failOnError) {
    this.failOnError = failOnError;
    return this;
  }

   /**
   * Fail on error
   * @return failOnError
  **/
  @ApiModelProperty(example = "null", value = "Fail on error")
  public Boolean getFailOnError() {
    return failOnError;
  }

  public void setFailOnError(Boolean failOnError) {
    this.failOnError = failOnError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertHtmlData convertHtmlData = (ConvertHtmlData) o;
    return Objects.equals(this.useAsyncPattern, convertHtmlData.useAsyncPattern) &&
        Objects.equals(this.sourceUrlOrHtml, convertHtmlData.sourceUrlOrHtml) &&
        Objects.equals(this.pageOrientation, convertHtmlData.pageOrientation) &&
        Objects.equals(this.username, convertHtmlData.username) &&
        Objects.equals(this.password, convertHtmlData.password) &&
        Objects.equals(this.authenticationType, convertHtmlData.authenticationType) &&
        Objects.equals(this.failOnError, convertHtmlData.failOnError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAsyncPattern, sourceUrlOrHtml, pageOrientation, username, password, authenticationType, failOnError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertHtmlData {\n");
    
    sb.append("    useAsyncPattern: ").append(toIndentedString(useAsyncPattern)).append("\n");
    sb.append("    sourceUrlOrHtml: ").append(toIndentedString(sourceUrlOrHtml)).append("\n");
    sb.append("    pageOrientation: ").append(toIndentedString(pageOrientation)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    failOnError: ").append(toIndentedString(failOnError)).append("\n");
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
