/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class Url {
  @SerializedName("bitrate")
  private Integer bitrate = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("player_id")
  private String playerId = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("width")
  private Integer width = null;

  public Url bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * The video bitrate, in kilobits per second (Kbps), of the output rendition that will be played at the URL. May correspond to the bitrate of an output rendition being used by the live stream or transcoder. Must be greater than &lt;strong&gt;0&lt;/strong&gt;.
   * @return bitrate
  **/
  @ApiModelProperty(example = "", value = "The video bitrate, in kilobits per second (Kbps), of the output rendition that will be played at the URL. May correspond to the bitrate of an output rendition being used by the live stream or transcoder. Must be greater than <strong>0</strong>.")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public Url createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the player URL was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the player URL was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Url height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height, in pixels, of the output rendition that will be played at the URL. May correspond to the height of an output rendition being used by the live stream or transcoder. Must be greater than &lt;strong&gt;0&lt;/strong&gt;.
   * @return height
  **/
  @ApiModelProperty(example = "", value = "The height, in pixels, of the output rendition that will be played at the URL. May correspond to the height of an output rendition being used by the live stream or transcoder. Must be greater than <strong>0</strong>.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Url id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the player URL.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the player URL.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Url label(String label) {
    this.label = label;
    return this;
  }

   /**
   * A descriptive name for the player URL. Maximum 255 characters.
   * @return label
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the player URL. Maximum 255 characters.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Url playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the player.
   * @return playerId
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the player.")
  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public Url updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the player URL was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the player URL was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Url url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the player. If using a Wowza CDN target, the URL format is &#x60;http://[wowzasubdomain]-f.akamaihd.net/z/[stream_name]_[angle]@[stream_id]/manifest.f4m&#x60; for Adobe HDS playback or &#x60;http://[wowzasubdomain]-f.akamaihd.net/i/[stream_name]_[angle]@[stream_id]/master.m3u8&#x60; for Apple HLS playback.
   * @return url
  **/
  @ApiModelProperty(example = "", value = "The URL of the player. If using a Wowza CDN target, the URL format is `http://[wowzasubdomain]-f.akamaihd.net/z/[stream_name]_[angle]@[stream_id]/manifest.f4m` for Adobe HDS playback or `http://[wowzasubdomain]-f.akamaihd.net/i/[stream_name]_[angle]@[stream_id]/master.m3u8` for Apple HLS playback.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Url width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width, in pixels, of the output rendition that will be played at the URL. May correspond to the width of an output rendition being used by the live stream or transcoder. Must be greater than &lt;strong&gt;0&lt;/strong&gt;.
   * @return width
  **/
  @ApiModelProperty(example = "", value = "The width, in pixels, of the output rendition that will be played at the URL. May correspond to the width of an output rendition being used by the live stream or transcoder. Must be greater than <strong>0</strong>.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Url url = (Url) o;
    return Objects.equals(this.bitrate, url.bitrate) &&
        Objects.equals(this.createdAt, url.createdAt) &&
        Objects.equals(this.height, url.height) &&
        Objects.equals(this.id, url.id) &&
        Objects.equals(this.label, url.label) &&
        Objects.equals(this.playerId, url.playerId) &&
        Objects.equals(this.updatedAt, url.updatedAt) &&
        Objects.equals(this.url, url.url) &&
        Objects.equals(this.width, url.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitrate, createdAt, height, id, label, playerId, updatedAt, url, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url {\n");
    
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

