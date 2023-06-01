package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceReference standalonePriceReference = StandalonePriceReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceReferenceBuilder implements Builder<StandalonePriceReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.standalone_price.StandalonePrice obj;

    
    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public StandalonePriceReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public StandalonePriceReferenceBuilder obj(Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public StandalonePriceReferenceBuilder withObj(Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePrice> builder) {
        this.obj = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public StandalonePriceReferenceBuilder obj(@Nullable final com.commercetools.api.models.standalone_price.StandalonePrice obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.standalone_price.StandalonePrice getObj(){
        return this.obj;
    }

    /**
     * builds StandalonePriceReference with checking for non-null required values
     * @return StandalonePriceReference
     */
    public StandalonePriceReference build() {
        Objects.requireNonNull(id, StandalonePriceReference.class + ": id is missing");
        return new StandalonePriceReferenceImpl(id, obj);
    }
    
    /**
     * builds StandalonePriceReference without checking for non-null required values
     * @return StandalonePriceReference
     */
    public StandalonePriceReference buildUnchecked() {
        return new StandalonePriceReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of StandalonePriceReferenceBuilder
     * @return builder 
     */
    public static StandalonePriceReferenceBuilder of() {
        return new StandalonePriceReferenceBuilder();
    }

    /**
     * create builder for StandalonePriceReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceReferenceBuilder of(final StandalonePriceReference template) {
        StandalonePriceReferenceBuilder builder = new StandalonePriceReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
