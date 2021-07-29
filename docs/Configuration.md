# Configuration

Creating http requests starts from the ApiRoot which  holds information specific to the project. To configure the ApiRoot use the following method:

```java
import com.commercetools.api.defaultconfig.ApiRootBuillder;
import com.commercetools.api.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.api.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        // ApiRoot config for Europe projects
        ApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                    ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .build();
    }
}
```

```java
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(),
                    ServiceRegion.GCP_US_CENTRAL1.getApiUrl())
                .build();
    }
}
```

```java
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        //ApiRoot config for ImportAPI
        ApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                    ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .build();

    }
}
```
