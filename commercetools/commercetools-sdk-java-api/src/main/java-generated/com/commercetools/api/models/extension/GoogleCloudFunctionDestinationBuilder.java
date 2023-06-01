package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.GoogleCloudFunctionDestination;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GoogleCloudFunctionDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GoogleCloudFunctionDestination googleCloudFunctionDestination = GoogleCloudFunctionDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GoogleCloudFunctionDestinationBuilder implements Builder<GoogleCloudFunctionDestination> {

    
    
    private String url;

    
    /**
     *  <p>URL to the target function.</p>
     * @param url value to be set
     * @return Builder
     */
    
    public GoogleCloudFunctionDestinationBuilder url( final String url) {
        this.url = url;
        return this;
    }
    
    

    /**
     *  <p>URL to the target function.</p>
     * @return url
     */
    
    
    public String getUrl(){
        return this.url;
    }

    /**
     * builds GoogleCloudFunctionDestination with checking for non-null required values
     * @return GoogleCloudFunctionDestination
     */
    public GoogleCloudFunctionDestination build() {
        Objects.requireNonNull(url, GoogleCloudFunctionDestination.class + ": url is missing");
        return new GoogleCloudFunctionDestinationImpl(url);
    }
    
    /**
     * builds GoogleCloudFunctionDestination without checking for non-null required values
     * @return GoogleCloudFunctionDestination
     */
    public GoogleCloudFunctionDestination buildUnchecked() {
        return new GoogleCloudFunctionDestinationImpl(url);
    }

    /**
     * factory method for an instance of GoogleCloudFunctionDestinationBuilder
     * @return builder 
     */
    public static GoogleCloudFunctionDestinationBuilder of() {
        return new GoogleCloudFunctionDestinationBuilder();
    }

    /**
     * create builder for GoogleCloudFunctionDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GoogleCloudFunctionDestinationBuilder of(final GoogleCloudFunctionDestination template) {
        GoogleCloudFunctionDestinationBuilder builder = new GoogleCloudFunctionDestinationBuilder();
        builder.url = template.getUrl();
        return builder;
    }

}
