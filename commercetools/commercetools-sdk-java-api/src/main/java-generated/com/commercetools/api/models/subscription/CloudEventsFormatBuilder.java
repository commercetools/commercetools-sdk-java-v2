package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.CloudEventsFormat;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CloudEventsFormatBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CloudEventsFormat cloudEventsFormat = CloudEventsFormat.builder()
 *             .cloudEventsVersion("{cloudEventsVersion}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CloudEventsFormatBuilder implements Builder<CloudEventsFormat> {

    
    
    private String cloudEventsVersion;

    
    /**
     * set the value to the cloudEventsVersion
     * @param cloudEventsVersion value to be set
     * @return Builder
     */
    
    public CloudEventsFormatBuilder cloudEventsVersion( final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        return this;
    }
    
    

    /**
     * value of cloudEventsVersion}
     * @return cloudEventsVersion
     */
    
    
    public String getCloudEventsVersion(){
        return this.cloudEventsVersion;
    }

    /**
     * builds CloudEventsFormat with checking for non-null required values
     * @return CloudEventsFormat
     */
    public CloudEventsFormat build() {
        Objects.requireNonNull(cloudEventsVersion, CloudEventsFormat.class + ": cloudEventsVersion is missing");
        return new CloudEventsFormatImpl(cloudEventsVersion);
    }
    
    /**
     * builds CloudEventsFormat without checking for non-null required values
     * @return CloudEventsFormat
     */
    public CloudEventsFormat buildUnchecked() {
        return new CloudEventsFormatImpl(cloudEventsVersion);
    }

    /**
     * factory method for an instance of CloudEventsFormatBuilder
     * @return builder 
     */
    public static CloudEventsFormatBuilder of() {
        return new CloudEventsFormatBuilder();
    }

    /**
     * create builder for CloudEventsFormat instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CloudEventsFormatBuilder of(final CloudEventsFormat template) {
        CloudEventsFormatBuilder builder = new CloudEventsFormatBuilder();
        builder.cloudEventsVersion = template.getCloudEventsVersion();
        return builder;
    }

}
