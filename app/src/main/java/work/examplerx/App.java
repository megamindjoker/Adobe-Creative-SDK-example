package work.examplerx;

import android.app.Application;

import com.adobe.creativesdk.foundation.AdobeCSDKFoundation;
import com.adobe.creativesdk.foundation.auth.IAdobeAuthClientCredentials;

/**
 * Created by Rakshak on 8/21/2017.
 */

public class App extends Application implements IAdobeAuthClientCredentials {

    private static final String CREATIVE_SDK_CLIENT_ID = "<YOUR_API_KEY_HERE>";
    private static final String CREATIVE_SDK_CLIENT_SECRET = "<YOUR_CLIENT_SECRET_HERE>";
    private static final String CREATIVE_SDK_REDIRECT_URI = "<YOUR_REDIRECT_URI_HERE>";
    private static final String[] CREATIVE_SDK_SCOPES = {"email", "profile", "address"};

    @Override
    public void onCreate() {
        super.onCreate();
        AdobeCSDKFoundation.initializeCSDKFoundation(getApplicationContext());
    }

    @Override
    public String getClientID() {
        return CREATIVE_SDK_CLIENT_ID;
    }

    @Override
    public String getClientSecret() {
        return CREATIVE_SDK_CLIENT_SECRET;
    }

    @Override
    public String[] getAdditionalScopesList() {
        return CREATIVE_SDK_SCOPES;
    }

    @Override
    public String getRedirectURI() {
        return CREATIVE_SDK_REDIRECT_URI;
    }
}
