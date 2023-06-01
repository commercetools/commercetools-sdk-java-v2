package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StagedQuoteDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDeletedMessagePayload stagedQuoteDeletedMessagePayload = StagedQuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteDeletedMessagePayloadBuilder implements Builder<StagedQuoteDeletedMessagePayload> {




    /**
     * builds StagedQuoteDeletedMessagePayload with checking for non-null required values
     * @return StagedQuoteDeletedMessagePayload
     */
    public StagedQuoteDeletedMessagePayload build() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }
    
    /**
     * builds StagedQuoteDeletedMessagePayload without checking for non-null required values
     * @return StagedQuoteDeletedMessagePayload
     */
    public StagedQuoteDeletedMessagePayload buildUnchecked() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of StagedQuoteDeletedMessagePayloadBuilder
     * @return builder 
     */
    public static StagedQuoteDeletedMessagePayloadBuilder of() {
        return new StagedQuoteDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for StagedQuoteDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteDeletedMessagePayloadBuilder of(final StagedQuoteDeletedMessagePayload template) {
        StagedQuoteDeletedMessagePayloadBuilder builder = new StagedQuoteDeletedMessagePayloadBuilder();
        return builder;
    }

}
