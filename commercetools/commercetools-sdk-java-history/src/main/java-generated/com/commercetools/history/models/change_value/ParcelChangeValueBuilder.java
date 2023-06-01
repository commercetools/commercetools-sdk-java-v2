package com.commercetools.history.models.change_value;


import com.commercetools.history.models.change_value.ParcelChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelChangeValue parcelChangeValue = ParcelChangeValue.builder()
 *             .id("{id}")
 *             .createdAt("{createdAt}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelChangeValueBuilder implements Builder<ParcelChangeValue> {

    
    
    private String id;
    
    
    
    private String createdAt;

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public ParcelChangeValueBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the createdAt
     * @param createdAt value to be set
     * @return Builder
     */
    
    public ParcelChangeValueBuilder createdAt( final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    

    /**
     * value of id}
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of createdAt}
     * @return createdAt
     */
    
    
    public String getCreatedAt(){
        return this.createdAt;
    }

    /**
     * builds ParcelChangeValue with checking for non-null required values
     * @return ParcelChangeValue
     */
    public ParcelChangeValue build() {
        Objects.requireNonNull(id, ParcelChangeValue.class + ": id is missing");
        Objects.requireNonNull(createdAt, ParcelChangeValue.class + ": createdAt is missing");
        return new ParcelChangeValueImpl(id, createdAt);
    }
    
    /**
     * builds ParcelChangeValue without checking for non-null required values
     * @return ParcelChangeValue
     */
    public ParcelChangeValue buildUnchecked() {
        return new ParcelChangeValueImpl(id, createdAt);
    }

    /**
     * factory method for an instance of ParcelChangeValueBuilder
     * @return builder 
     */
    public static ParcelChangeValueBuilder of() {
        return new ParcelChangeValueBuilder();
    }

    /**
     * create builder for ParcelChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelChangeValueBuilder of(final ParcelChangeValue template) {
        ParcelChangeValueBuilder builder = new ParcelChangeValueBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
