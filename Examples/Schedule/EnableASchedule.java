 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class EnableASchedule {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-access-key.setApiKeyPrefix("Token");

        // Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-api-key.setApiKeyPrefix("Token");

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
		ScheduleState result = apiInstance.enableSchedule(scheduleId);
		System.out.println(result);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#enableSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#enableSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}

