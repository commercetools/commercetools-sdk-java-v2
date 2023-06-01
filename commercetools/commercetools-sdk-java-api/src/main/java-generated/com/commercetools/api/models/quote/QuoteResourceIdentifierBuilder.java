package com.commercetools.api.models.quote;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.quote.QuoteResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteResourceIdentifier quoteResourceIdentifier = QuoteResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteResourceIdentifierBuilder implements Builder<QuoteResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public QuoteResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public QuoteResourceIdentifierBuilder key(@Nullable final String key) {
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
     * builds QuoteResourceIdentifier with checking for non-null required values
     * @return QuoteResourceIdentifier
     */
    public QuoteResourceIdentifier build() {
        return new QuoteResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds QuoteResourceIdentifier without checking for non-null required values
     * @return QuoteResourceIdentifier
     */
    public QuoteResourceIdentifier buildUnchecked() {
        return new QuoteResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of QuoteResourceIdentifierBuilder
     * @return builder 
     */
    public static QuoteResourceIdentifierBuilder of() {
        return new QuoteResourceIdentifierBuilder();
    }

    /**
     * create builder for QuoteResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteResourceIdentifierBuilder of(final QuoteResourceIdentifier template) {
        QuoteResourceIdentifierBuilder builder = new QuoteResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
