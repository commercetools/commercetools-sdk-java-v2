package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.QuoteDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDeletedMessagePayload quoteDeletedMessagePayload = QuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteDeletedMessagePayloadBuilder implements Builder<QuoteDeletedMessagePayload> {




    /**
     * builds QuoteDeletedMessagePayload with checking for non-null required values
     * @return QuoteDeletedMessagePayload
     */
    public QuoteDeletedMessagePayload build() {
        return new QuoteDeletedMessagePayloadImpl();
    }
    
    /**
     * builds QuoteDeletedMessagePayload without checking for non-null required values
     * @return QuoteDeletedMessagePayload
     */
    public QuoteDeletedMessagePayload buildUnchecked() {
        return new QuoteDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of QuoteDeletedMessagePayloadBuilder
     * @return builder 
     */
    public static QuoteDeletedMessagePayloadBuilder of() {
        return new QuoteDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteDeletedMessagePayloadBuilder of(final QuoteDeletedMessagePayload template) {
        QuoteDeletedMessagePayloadBuilder builder = new QuoteDeletedMessagePayloadBuilder();
        return builder;
    }

}
