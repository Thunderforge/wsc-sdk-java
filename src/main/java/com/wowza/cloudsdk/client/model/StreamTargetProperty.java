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

/**
 * 
 */
@ApiModel(description = "")
public class StreamTargetProperty {
  /**
   * &lt;strong&gt;chunkSize&lt;/strong&gt; defines the duration of the time-based audio and video chunks that Wowza Streaming Cloud delivers to the target. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;convertAMFData&lt;/strong&gt; determines whether Wowza Streaming Cloud converts incoming AMF data into ID3 tags. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;sendSSL&lt;/strong&gt; determines whether Wowza Streaming Cloud sends the stream from the transcoder to the target by using SSL (HTTPS). &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;playSSL&lt;/strong&gt; determines whether Wowza Streaming Cloud sends the stream from the target to the player by using SSL (HTTPS). &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;playlistSeconds&lt;/strong&gt; defines the maximum allowable length of the playlist. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;redundantChunklists&lt;/strong&gt; determines whether Wowza Streaming Cloud creates redundant chunklists within a playlist. If a primary chunklist within a playlist fails, players that support redundancy during playback can switch to the redundant chunklist.&lt;br /&gt;&lt;br /&gt;**Note:** Enabling **redundantChunklists** increases playback reliability but doubles egress data usage and associated charges.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;relativePlaylists&lt;/strong&gt; allows the viewer to watch the stream over HTTP and HTTPS, whichever protocol their browser calls.
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    CHUNKSIZE("chunkSize"),
    
    CONVERTAMFDATA("convertAMFData"),
    
    SENDSSL("sendSSL"),
    
    PLAYSSL("playSSL"),
    
    PLAYLISTSECONDS("playlistSeconds"),
    
    REDUNDANTCHUNKLISTS("redundantChunklists"),
    
    RELATIVEPLAYLISTS("relativePlaylists");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String text) {
      for (KeyEnum b : KeyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("key")
  private KeyEnum key = null;

  /**
   * The section of the stream target configuration table that contains the property. &lt;br /&gt;&lt;br /&gt;The valid value for &lt;strong&gt;chunkSize&lt;/strong&gt;, &lt;strong&gt;convertAMFData&lt;/strong&gt;, and &lt;strong&gt;sendSSL&lt;/strong&gt; is &lt;strong&gt;hls&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;The valid value for &lt;strong&gt;playSSL&lt;/strong&gt;, &lt;strong&gt;playlistSeconds&lt;/strong&gt;, &lt;strong&gt;redundantChunklists&lt;/strong&gt;, and &lt;strong&gt;relativePlaylists&lt;/strong&gt; is &lt;strong&gt;playlist&lt;/strong&gt;.
   */
  @JsonAdapter(SectionEnum.Adapter.class)
  public enum SectionEnum {
    HLS("hls"),
    
    PLAYLIST("playlist");

    private String value;

    SectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SectionEnum fromValue(String text) {
      for (SectionEnum b : SectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("section")
  private SectionEnum section = null;

  @SerializedName("value")
  private String value = null;

  public StreamTargetProperty key(KeyEnum key) {
    this.key = key;
    return this;
  }

   /**
   * &lt;strong&gt;chunkSize&lt;/strong&gt; defines the duration of the time-based audio and video chunks that Wowza Streaming Cloud delivers to the target. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;convertAMFData&lt;/strong&gt; determines whether Wowza Streaming Cloud converts incoming AMF data into ID3 tags. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;sendSSL&lt;/strong&gt; determines whether Wowza Streaming Cloud sends the stream from the transcoder to the target by using SSL (HTTPS). &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;playSSL&lt;/strong&gt; determines whether Wowza Streaming Cloud sends the stream from the target to the player by using SSL (HTTPS). &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;playlistSeconds&lt;/strong&gt; defines the maximum allowable length of the playlist. &lt;br /&gt;&lt;br /&gt;&lt;strong&gt;redundantChunklists&lt;/strong&gt; determines whether Wowza Streaming Cloud creates redundant chunklists within a playlist. If a primary chunklist within a playlist fails, players that support redundancy during playback can switch to the redundant chunklist.&lt;br /&gt;&lt;br /&gt;**Note:** Enabling **redundantChunklists** increases playback reliability but doubles egress data usage and associated charges.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;relativePlaylists&lt;/strong&gt; allows the viewer to watch the stream over HTTP and HTTPS, whichever protocol their browser calls.
   * @return key
  **/
  @ApiModelProperty(example = "", value = "<strong>chunkSize</strong> defines the duration of the time-based audio and video chunks that Wowza Streaming Cloud delivers to the target. <br /><br /><strong>convertAMFData</strong> determines whether Wowza Streaming Cloud converts incoming AMF data into ID3 tags. <br /><br /><strong>sendSSL</strong> determines whether Wowza Streaming Cloud sends the stream from the transcoder to the target by using SSL (HTTPS). <br /><br /><strong>playSSL</strong> determines whether Wowza Streaming Cloud sends the stream from the target to the player by using SSL (HTTPS). <br /><br /><strong>playlistSeconds</strong> defines the maximum allowable length of the playlist. <br /><br /><strong>redundantChunklists</strong> determines whether Wowza Streaming Cloud creates redundant chunklists within a playlist. If a primary chunklist within a playlist fails, players that support redundancy during playback can switch to the redundant chunklist.<br /><br />**Note:** Enabling **redundantChunklists** increases playback reliability but doubles egress data usage and associated charges.<br /><br /><strong>relativePlaylists</strong> allows the viewer to watch the stream over HTTP and HTTPS, whichever protocol their browser calls.")
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }

  public StreamTargetProperty section(SectionEnum section) {
    this.section = section;
    return this;
  }

   /**
   * The section of the stream target configuration table that contains the property. &lt;br /&gt;&lt;br /&gt;The valid value for &lt;strong&gt;chunkSize&lt;/strong&gt;, &lt;strong&gt;convertAMFData&lt;/strong&gt;, and &lt;strong&gt;sendSSL&lt;/strong&gt; is &lt;strong&gt;hls&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;The valid value for &lt;strong&gt;playSSL&lt;/strong&gt;, &lt;strong&gt;playlistSeconds&lt;/strong&gt;, &lt;strong&gt;redundantChunklists&lt;/strong&gt;, and &lt;strong&gt;relativePlaylists&lt;/strong&gt; is &lt;strong&gt;playlist&lt;/strong&gt;.
   * @return section
  **/
  @ApiModelProperty(example = "", value = "The section of the stream target configuration table that contains the property. <br /><br />The valid value for <strong>chunkSize</strong>, <strong>convertAMFData</strong>, and <strong>sendSSL</strong> is <strong>hls</strong>. <br /><br />The valid value for <strong>playSSL</strong>, <strong>playlistSeconds</strong>, <strong>redundantChunklists</strong>, and <strong>relativePlaylists</strong> is <strong>playlist</strong>.")
  public SectionEnum getSection() {
    return section;
  }

  public void setSection(SectionEnum section) {
    this.section = section;
  }

  public StreamTargetProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Valid values for &lt;strong&gt;chunkSize&lt;/strong&gt; are the integers &lt;strong&gt;2&lt;/strong&gt;, &lt;strong&gt;4&lt;/strong&gt;, &lt;strong&gt;6&lt;/strong&gt;, &lt;strong&gt;8&lt;/strong&gt;, and &lt;strong&gt;10&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;Valid values for &lt;strong&gt;convertAMFData&lt;/strong&gt;, &lt;strong&gt;sendSSL&lt;/strong&gt;, &lt;strong&gt;playSSL&lt;/strong&gt;, &lt;strong&gt;redundantChunklists&lt;/strong&gt;, and &lt;strong&gt;relativePlaylists&lt;/strong&gt; are the Booleans &lt;strong&gt;true&lt;/strong&gt; and &lt;strong&gt;false&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;Valid values for &lt;strong&gt;playlistSeconds&lt;/strong&gt; are any integer between &lt;strong&gt;6&lt;/strong&gt; and &lt;strong&gt;200&lt;/strong&gt;.
   * @return value
  **/
  @ApiModelProperty(example = "", value = "Valid values for <strong>chunkSize</strong> are the integers <strong>2</strong>, <strong>4</strong>, <strong>6</strong>, <strong>8</strong>, and <strong>10</strong>. <br /><br />Valid values for <strong>convertAMFData</strong>, <strong>sendSSL</strong>, <strong>playSSL</strong>, <strong>redundantChunklists</strong>, and <strong>relativePlaylists</strong> are the Booleans <strong>true</strong> and <strong>false</strong>. <br /><br />Valid values for <strong>playlistSeconds</strong> are any integer between <strong>6</strong> and <strong>200</strong>.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamTargetProperty streamTargetProperty = (StreamTargetProperty) o;
    return Objects.equals(this.key, streamTargetProperty.key) &&
        Objects.equals(this.section, streamTargetProperty.section) &&
        Objects.equals(this.value, streamTargetProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, section, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamTargetProperty {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
