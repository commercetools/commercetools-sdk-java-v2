package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionSetTimeoutInMsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetTimeoutInMsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetTimeoutInMsAction extensionSetTimeoutInMsAction = ExtensionSetTimeoutInMsAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExtensionSetTimeoutInMsActionBuilder implements Builder<ExtensionSetTimeoutInMsAction> {

    
    @Nullable
    private Integer timeoutInMs;

    
    /**
     *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact our support via the Support Portal and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     * @return Builder
     */
    
    public ExtensionSetTimeoutInMsActionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact our support via the Support Portal and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */
    
    @Nullable
    public Integer getTimeoutInMs(){
        return this.timeoutInMs;
    }

    /**
     * builds ExtensionSetTimeoutInMsAction with checking for non-null required values
     * @return ExtensionSetTimeoutInMsAction
     */
    public ExtensionSetTimeoutInMsAction build() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }
    
    /**
     * builds ExtensionSetTimeoutInMsAction without checking for non-null required values
     * @return ExtensionSetTimeoutInMsAction
     */
    public ExtensionSetTimeoutInMsAction buildUnchecked() {
        return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
    }

    /**
     * factory method for an instance of ExtensionSetTimeoutInMsActionBuilder
     * @return builder 
     */
    public static ExtensionSetTimeoutInMsActionBuilder of() {
        return new ExtensionSetTimeoutInMsActionBuilder();
    }

    /**
     * create builder for ExtensionSetTimeoutInMsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetTimeoutInMsActionBuilder of(final ExtensionSetTimeoutInMsAction template) {
        ExtensionSetTimeoutInMsActionBuilder builder = new ExtensionSetTimeoutInMsActionBuilder();
        builder.timeoutInMs = template.getTimeoutInMs();
        return builder;
    }

}
