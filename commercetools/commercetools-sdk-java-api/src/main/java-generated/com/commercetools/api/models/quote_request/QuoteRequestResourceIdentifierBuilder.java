package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestResourceIdentifier quoteRequestResourceIdentifier = QuoteRequestResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestResourceIdentifierBuilder implements Builder<QuoteRequestResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public QuoteRequestResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public QuoteRequestResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds QuoteRequestResourceIdentifier with checking for non-null required values
     * @return QuoteRequestResourceIdentifier
     */
    public QuoteRequestResourceIdentifier build() {
        return new QuoteRequestResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds QuoteRequestResourceIdentifier without checking for non-null required values
     * @return QuoteRequestResourceIdentifier
     */
    public QuoteRequestResourceIdentifier buildUnchecked() {
        return new QuoteRequestResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of QuoteRequestResourceIdentifierBuilder
     * @return builder 
     */
    public static QuoteRequestResourceIdentifierBuilder of() {
        return new QuoteRequestResourceIdentifierBuilder();
    }

    /**
     * create builder for QuoteRequestResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestResourceIdentifierBuilder of(final QuoteRequestResourceIdentifier template) {
        QuoteRequestResourceIdentifierBuilder builder = new QuoteRequestResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
