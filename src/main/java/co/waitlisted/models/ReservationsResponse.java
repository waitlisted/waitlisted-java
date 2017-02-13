/**
 * Waitlisted API
 * Waitlisted API
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package co.waitlisted.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;


/**
 * ReservationsResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-12T22:31:49.803-06:00")
public class ReservationsResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("affiliate")
  private String affiliate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referred_count")
  private Integer referredCount = null;

  @JsonProperty("position")
  private Integer position = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("activated_at")
  private Date activatedAt = null;

  @JsonProperty("created_at")
  private Date createdAt = null;

  public ReservationsResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "dea681f300a068fb29a4790c866cbd18", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReservationsResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(example = "dea681f300a068fb29a4790c866cbd18", value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ReservationsResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "test@waitlisted.co", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ReservationsResponse affiliate(String affiliate) {
    this.affiliate = affiliate;
    return this;
  }

   /**
   * Get affiliate
   * @return affiliate
  **/
  @ApiModelProperty(example = "dea681f3", value = "")
  public String getAffiliate() {
    return affiliate;
  }

  public void setAffiliate(String affiliate) {
    this.affiliate = affiliate;
  }

  public ReservationsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Sam Smith", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReservationsResponse referredCount(Integer referredCount) {
    this.referredCount = referredCount;
    return this;
  }

   /**
   * Get referredCount
   * @return referredCount
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getReferredCount() {
    return referredCount;
  }

  public void setReferredCount(Integer referredCount) {
    this.referredCount = referredCount;
  }

  public ReservationsResponse position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "93", value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ReservationsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "505", value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ReservationsResponse activatedAt(Date activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

   /**
   * Get activatedAt
   * @return activatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(Date activatedAt) {
    this.activatedAt = activatedAt;
  }

  public ReservationsResponse createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationsResponse reservationsResponse = (ReservationsResponse) o;
    return Objects.equals(this.id, reservationsResponse.id) &&
        Objects.equals(this.uuid, reservationsResponse.uuid) &&
        Objects.equals(this.email, reservationsResponse.email) &&
        Objects.equals(this.affiliate, reservationsResponse.affiliate) &&
        Objects.equals(this.name, reservationsResponse.name) &&
        Objects.equals(this.referredCount, reservationsResponse.referredCount) &&
        Objects.equals(this.position, reservationsResponse.position) &&
        Objects.equals(this.totalCount, reservationsResponse.totalCount) &&
        Objects.equals(this.activatedAt, reservationsResponse.activatedAt) &&
        Objects.equals(this.createdAt, reservationsResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, email, affiliate, name, referredCount, position, totalCount, activatedAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referredCount: ").append(toIndentedString(referredCount)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

