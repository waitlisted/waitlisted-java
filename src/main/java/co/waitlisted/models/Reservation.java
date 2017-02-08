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
import co.waitlisted.models.FormResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Reservation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T10:54:16.208-06:00")
public class Reservation   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("affiliate")
  private String affiliate = null;

  @JsonProperty("responses")
  private FormResponse responses = null;

  public Reservation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "testemail@waitlisted.co", required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Reservation name(String name) {
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

  public Reservation affiliate(String affiliate) {
    this.affiliate = affiliate;
    return this;
  }

   /**
   * Get affiliate
   * @return affiliate
  **/
  @ApiModelProperty(example = "ABC12345", value = "")
  public String getAffiliate() {
    return affiliate;
  }

  public void setAffiliate(String affiliate) {
    this.affiliate = affiliate;
  }

  public Reservation responses(FormResponse responses) {
    this.responses = responses;
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @ApiModelProperty(example = "null", value = "")
  public FormResponse getResponses() {
    return responses;
  }

  public void setResponses(FormResponse responses) {
    this.responses = responses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(this.email, reservation.email) &&
        Objects.equals(this.name, reservation.name) &&
        Objects.equals(this.affiliate, reservation.affiliate) &&
        Objects.equals(this.responses, reservation.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, affiliate, responses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

