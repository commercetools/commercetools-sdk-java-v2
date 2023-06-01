package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteResourceIdentifier stagedQuoteResourceIdentifier = StagedQuoteResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteResourceIdentifierBuilder implements Builder<StagedQuoteResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public StagedQuoteResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public StagedQuoteResourceIdentifierBuilder key(@Nullable final String key) {
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
     * builds StagedQuoteResourceIdentifier with checking for non-null required values
     * @return StagedQuoteResourceIdentifier
     */
    public StagedQuoteResourceIdentifier build() {
        return new StagedQuoteResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds StagedQuoteResourceIdentifier without checking for non-null required values
     * @return StagedQuoteResourceIdentifier
     */
    public StagedQuoteResourceIdentifier buildUnchecked() {
        return new StagedQuoteResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of StagedQuoteResourceIdentifierBuilder
     * @return builder 
     */
    public static StagedQuoteResourceIdentifierBuilder of() {
        return new StagedQuoteResourceIdentifierBuilder();
    }

    /**
     * create builder for StagedQuoteResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteResourceIdentifierBuilder of(final StagedQuoteResourceIdentifier template) {
        StagedQuoteResourceIdentifierBuilder builder = new StagedQuoteResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
