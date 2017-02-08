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


/**
 * SiteResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T10:54:16.208-06:00")
public class SiteResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("brand_color")
  private String brandColor = null;

  @JsonProperty("button_text_color")
  private String buttonTextColor = null;

  @JsonProperty("custom_styles")
  private String customStyles = null;

  @JsonProperty("ask_name")
  private Boolean askName = null;

  @JsonProperty("signup_title")
  private String signupTitle = null;

  @JsonProperty("signup_copy")
  private String signupCopy = null;

  @JsonProperty("position_title")
  private String positionTitle = null;

  @JsonProperty("social_copy")
  private String socialCopy = null;

  @JsonProperty("social_message")
  private String socialMessage = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("share_social_copy")
  private String shareSocialCopy = null;

  @JsonProperty("referral_copy")
  private String referralCopy = null;

  @JsonProperty("check_position_copy")
  private String checkPositionCopy = null;

  @JsonProperty("join_button_copy")
  private String joinButtonCopy = null;

  @JsonProperty("check_reservation_copy")
  private String checkReservationCopy = null;

  @JsonProperty("email_field_label")
  private String emailFieldLabel = null;

  @JsonProperty("name_field_label")
  private String nameFieldLabel = null;

  @JsonProperty("thank_you_share_template")
  private String thankYouShareTemplate = null;

  @JsonProperty("waitlist_threshold")
  private Integer waitlistThreshold = null;

  @JsonProperty("use_custom_thank_you")
  private Boolean useCustomThankYou = null;

  @JsonProperty("hide_waitlist")
  private Boolean hideWaitlist = null;

  @JsonProperty("unmet_shared_template")
  private String unmetSharedTemplate = null;

  @JsonProperty("threshold_met")
  private Boolean thresholdMet = null;

  @JsonProperty("website_url")
  private String websiteUrl = null;

  @JsonProperty("tracking_code")
  private String trackingCode = null;

  @JsonProperty("custom_css")
  private String customCss = null;

  @JsonProperty("hide_branding")
  private Boolean hideBranding = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  public SiteResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "waitlisted.app.waitlisted.co", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SiteResponse brandColor(String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

   /**
   * Get brandColor
   * @return brandColor
  **/
  @ApiModelProperty(example = "#FF0000", value = "")
  public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }

  public SiteResponse buttonTextColor(String buttonTextColor) {
    this.buttonTextColor = buttonTextColor;
    return this;
  }

   /**
   * Get buttonTextColor
   * @return buttonTextColor
  **/
  @ApiModelProperty(example = "#00FF00", value = "")
  public String getButtonTextColor() {
    return buttonTextColor;
  }

  public void setButtonTextColor(String buttonTextColor) {
    this.buttonTextColor = buttonTextColor;
  }

  public SiteResponse customStyles(String customStyles) {
    this.customStyles = customStyles;
    return this;
  }

   /**
   * Get customStyles
   * @return customStyles
  **/
  @ApiModelProperty(example = "div {display: block}", value = "")
  public String getCustomStyles() {
    return customStyles;
  }

  public void setCustomStyles(String customStyles) {
    this.customStyles = customStyles;
  }

  public SiteResponse askName(Boolean askName) {
    this.askName = askName;
    return this;
  }

   /**
   * Get askName
   * @return askName
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getAskName() {
    return askName;
  }

  public void setAskName(Boolean askName) {
    this.askName = askName;
  }

  public SiteResponse signupTitle(String signupTitle) {
    this.signupTitle = signupTitle;
    return this;
  }

   /**
   * Get signupTitle
   * @return signupTitle
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getSignupTitle() {
    return signupTitle;
  }

  public void setSignupTitle(String signupTitle) {
    this.signupTitle = signupTitle;
  }

  public SiteResponse signupCopy(String signupCopy) {
    this.signupCopy = signupCopy;
    return this;
  }

   /**
   * Get signupCopy
   * @return signupCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getSignupCopy() {
    return signupCopy;
  }

  public void setSignupCopy(String signupCopy) {
    this.signupCopy = signupCopy;
  }

  public SiteResponse positionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * Get positionTitle
   * @return positionTitle
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getPositionTitle() {
    return positionTitle;
  }

  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }

  public SiteResponse socialCopy(String socialCopy) {
    this.socialCopy = socialCopy;
    return this;
  }

   /**
   * Get socialCopy
   * @return socialCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getSocialCopy() {
    return socialCopy;
  }

  public void setSocialCopy(String socialCopy) {
    this.socialCopy = socialCopy;
  }

  public SiteResponse socialMessage(String socialMessage) {
    this.socialMessage = socialMessage;
    return this;
  }

   /**
   * Get socialMessage
   * @return socialMessage
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getSocialMessage() {
    return socialMessage;
  }

  public void setSocialMessage(String socialMessage) {
    this.socialMessage = socialMessage;
  }

  public SiteResponse domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "waitlisted.app.waitlisted.co", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SiteResponse shareSocialCopy(String shareSocialCopy) {
    this.shareSocialCopy = shareSocialCopy;
    return this;
  }

   /**
   * Get shareSocialCopy
   * @return shareSocialCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getShareSocialCopy() {
    return shareSocialCopy;
  }

  public void setShareSocialCopy(String shareSocialCopy) {
    this.shareSocialCopy = shareSocialCopy;
  }

  public SiteResponse referralCopy(String referralCopy) {
    this.referralCopy = referralCopy;
    return this;
  }

   /**
   * Get referralCopy
   * @return referralCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getReferralCopy() {
    return referralCopy;
  }

  public void setReferralCopy(String referralCopy) {
    this.referralCopy = referralCopy;
  }

  public SiteResponse checkPositionCopy(String checkPositionCopy) {
    this.checkPositionCopy = checkPositionCopy;
    return this;
  }

   /**
   * Get checkPositionCopy
   * @return checkPositionCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getCheckPositionCopy() {
    return checkPositionCopy;
  }

  public void setCheckPositionCopy(String checkPositionCopy) {
    this.checkPositionCopy = checkPositionCopy;
  }

  public SiteResponse joinButtonCopy(String joinButtonCopy) {
    this.joinButtonCopy = joinButtonCopy;
    return this;
  }

   /**
   * Get joinButtonCopy
   * @return joinButtonCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getJoinButtonCopy() {
    return joinButtonCopy;
  }

  public void setJoinButtonCopy(String joinButtonCopy) {
    this.joinButtonCopy = joinButtonCopy;
  }

  public SiteResponse checkReservationCopy(String checkReservationCopy) {
    this.checkReservationCopy = checkReservationCopy;
    return this;
  }

   /**
   * Get checkReservationCopy
   * @return checkReservationCopy
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getCheckReservationCopy() {
    return checkReservationCopy;
  }

  public void setCheckReservationCopy(String checkReservationCopy) {
    this.checkReservationCopy = checkReservationCopy;
  }

  public SiteResponse emailFieldLabel(String emailFieldLabel) {
    this.emailFieldLabel = emailFieldLabel;
    return this;
  }

   /**
   * Get emailFieldLabel
   * @return emailFieldLabel
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getEmailFieldLabel() {
    return emailFieldLabel;
  }

  public void setEmailFieldLabel(String emailFieldLabel) {
    this.emailFieldLabel = emailFieldLabel;
  }

  public SiteResponse nameFieldLabel(String nameFieldLabel) {
    this.nameFieldLabel = nameFieldLabel;
    return this;
  }

   /**
   * Get nameFieldLabel
   * @return nameFieldLabel
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getNameFieldLabel() {
    return nameFieldLabel;
  }

  public void setNameFieldLabel(String nameFieldLabel) {
    this.nameFieldLabel = nameFieldLabel;
  }

  public SiteResponse thankYouShareTemplate(String thankYouShareTemplate) {
    this.thankYouShareTemplate = thankYouShareTemplate;
    return this;
  }

   /**
   * Get thankYouShareTemplate
   * @return thankYouShareTemplate
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getThankYouShareTemplate() {
    return thankYouShareTemplate;
  }

  public void setThankYouShareTemplate(String thankYouShareTemplate) {
    this.thankYouShareTemplate = thankYouShareTemplate;
  }

  public SiteResponse waitlistThreshold(Integer waitlistThreshold) {
    this.waitlistThreshold = waitlistThreshold;
    return this;
  }

   /**
   * Get waitlistThreshold
   * @return waitlistThreshold
  **/
  @ApiModelProperty(example = "50", value = "")
  public Integer getWaitlistThreshold() {
    return waitlistThreshold;
  }

  public void setWaitlistThreshold(Integer waitlistThreshold) {
    this.waitlistThreshold = waitlistThreshold;
  }

  public SiteResponse useCustomThankYou(Boolean useCustomThankYou) {
    this.useCustomThankYou = useCustomThankYou;
    return this;
  }

   /**
   * Get useCustomThankYou
   * @return useCustomThankYou
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getUseCustomThankYou() {
    return useCustomThankYou;
  }

  public void setUseCustomThankYou(Boolean useCustomThankYou) {
    this.useCustomThankYou = useCustomThankYou;
  }

  public SiteResponse hideWaitlist(Boolean hideWaitlist) {
    this.hideWaitlist = hideWaitlist;
    return this;
  }

   /**
   * Get hideWaitlist
   * @return hideWaitlist
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getHideWaitlist() {
    return hideWaitlist;
  }

  public void setHideWaitlist(Boolean hideWaitlist) {
    this.hideWaitlist = hideWaitlist;
  }

  public SiteResponse unmetSharedTemplate(String unmetSharedTemplate) {
    this.unmetSharedTemplate = unmetSharedTemplate;
    return this;
  }

   /**
   * Get unmetSharedTemplate
   * @return unmetSharedTemplate
  **/
  @ApiModelProperty(example = "Some text", value = "")
  public String getUnmetSharedTemplate() {
    return unmetSharedTemplate;
  }

  public void setUnmetSharedTemplate(String unmetSharedTemplate) {
    this.unmetSharedTemplate = unmetSharedTemplate;
  }

  public SiteResponse thresholdMet(Boolean thresholdMet) {
    this.thresholdMet = thresholdMet;
    return this;
  }

   /**
   * Get thresholdMet
   * @return thresholdMet
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getThresholdMet() {
    return thresholdMet;
  }

  public void setThresholdMet(Boolean thresholdMet) {
    this.thresholdMet = thresholdMet;
  }

  public SiteResponse websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @ApiModelProperty(example = "https://www.waitlisted.co", value = "")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public SiteResponse trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * Get trackingCode
   * @return trackingCode
  **/
  @ApiModelProperty(example = "&lt;script&gt;&lt;/script&gt;", value = "")
  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }

  public SiteResponse customCss(String customCss) {
    this.customCss = customCss;
    return this;
  }

   /**
   * Get customCss
   * @return customCss
  **/
  @ApiModelProperty(example = "a {}", value = "")
  public String getCustomCss() {
    return customCss;
  }

  public void setCustomCss(String customCss) {
    this.customCss = customCss;
  }

  public SiteResponse hideBranding(Boolean hideBranding) {
    this.hideBranding = hideBranding;
    return this;
  }

   /**
   * Get hideBranding
   * @return hideBranding
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getHideBranding() {
    return hideBranding;
  }

  public void setHideBranding(Boolean hideBranding) {
    this.hideBranding = hideBranding;
  }

  public SiteResponse totalCount(Integer totalCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteResponse siteResponse = (SiteResponse) o;
    return Objects.equals(this.id, siteResponse.id) &&
        Objects.equals(this.brandColor, siteResponse.brandColor) &&
        Objects.equals(this.buttonTextColor, siteResponse.buttonTextColor) &&
        Objects.equals(this.customStyles, siteResponse.customStyles) &&
        Objects.equals(this.askName, siteResponse.askName) &&
        Objects.equals(this.signupTitle, siteResponse.signupTitle) &&
        Objects.equals(this.signupCopy, siteResponse.signupCopy) &&
        Objects.equals(this.positionTitle, siteResponse.positionTitle) &&
        Objects.equals(this.socialCopy, siteResponse.socialCopy) &&
        Objects.equals(this.socialMessage, siteResponse.socialMessage) &&
        Objects.equals(this.domain, siteResponse.domain) &&
        Objects.equals(this.shareSocialCopy, siteResponse.shareSocialCopy) &&
        Objects.equals(this.referralCopy, siteResponse.referralCopy) &&
        Objects.equals(this.checkPositionCopy, siteResponse.checkPositionCopy) &&
        Objects.equals(this.joinButtonCopy, siteResponse.joinButtonCopy) &&
        Objects.equals(this.checkReservationCopy, siteResponse.checkReservationCopy) &&
        Objects.equals(this.emailFieldLabel, siteResponse.emailFieldLabel) &&
        Objects.equals(this.nameFieldLabel, siteResponse.nameFieldLabel) &&
        Objects.equals(this.thankYouShareTemplate, siteResponse.thankYouShareTemplate) &&
        Objects.equals(this.waitlistThreshold, siteResponse.waitlistThreshold) &&
        Objects.equals(this.useCustomThankYou, siteResponse.useCustomThankYou) &&
        Objects.equals(this.hideWaitlist, siteResponse.hideWaitlist) &&
        Objects.equals(this.unmetSharedTemplate, siteResponse.unmetSharedTemplate) &&
        Objects.equals(this.thresholdMet, siteResponse.thresholdMet) &&
        Objects.equals(this.websiteUrl, siteResponse.websiteUrl) &&
        Objects.equals(this.trackingCode, siteResponse.trackingCode) &&
        Objects.equals(this.customCss, siteResponse.customCss) &&
        Objects.equals(this.hideBranding, siteResponse.hideBranding) &&
        Objects.equals(this.totalCount, siteResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brandColor, buttonTextColor, customStyles, askName, signupTitle, signupCopy, positionTitle, socialCopy, socialMessage, domain, shareSocialCopy, referralCopy, checkPositionCopy, joinButtonCopy, checkReservationCopy, emailFieldLabel, nameFieldLabel, thankYouShareTemplate, waitlistThreshold, useCustomThankYou, hideWaitlist, unmetSharedTemplate, thresholdMet, websiteUrl, trackingCode, customCss, hideBranding, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    buttonTextColor: ").append(toIndentedString(buttonTextColor)).append("\n");
    sb.append("    customStyles: ").append(toIndentedString(customStyles)).append("\n");
    sb.append("    askName: ").append(toIndentedString(askName)).append("\n");
    sb.append("    signupTitle: ").append(toIndentedString(signupTitle)).append("\n");
    sb.append("    signupCopy: ").append(toIndentedString(signupCopy)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    socialCopy: ").append(toIndentedString(socialCopy)).append("\n");
    sb.append("    socialMessage: ").append(toIndentedString(socialMessage)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    shareSocialCopy: ").append(toIndentedString(shareSocialCopy)).append("\n");
    sb.append("    referralCopy: ").append(toIndentedString(referralCopy)).append("\n");
    sb.append("    checkPositionCopy: ").append(toIndentedString(checkPositionCopy)).append("\n");
    sb.append("    joinButtonCopy: ").append(toIndentedString(joinButtonCopy)).append("\n");
    sb.append("    checkReservationCopy: ").append(toIndentedString(checkReservationCopy)).append("\n");
    sb.append("    emailFieldLabel: ").append(toIndentedString(emailFieldLabel)).append("\n");
    sb.append("    nameFieldLabel: ").append(toIndentedString(nameFieldLabel)).append("\n");
    sb.append("    thankYouShareTemplate: ").append(toIndentedString(thankYouShareTemplate)).append("\n");
    sb.append("    waitlistThreshold: ").append(toIndentedString(waitlistThreshold)).append("\n");
    sb.append("    useCustomThankYou: ").append(toIndentedString(useCustomThankYou)).append("\n");
    sb.append("    hideWaitlist: ").append(toIndentedString(hideWaitlist)).append("\n");
    sb.append("    unmetSharedTemplate: ").append(toIndentedString(unmetSharedTemplate)).append("\n");
    sb.append("    thresholdMet: ").append(toIndentedString(thresholdMet)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
    sb.append("    hideBranding: ").append(toIndentedString(hideBranding)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

