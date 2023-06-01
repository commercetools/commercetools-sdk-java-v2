package com.commercetools.api.models.state;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateResourceIdentifier stateResourceIdentifier = StateResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateResourceIdentifierBuilder implements Builder<StateResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public StateResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public StateResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds StateResourceIdentifier with checking for non-null required values
     * @return StateResourceIdentifier
     */
    public StateResourceIdentifier build() {
        return new StateResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds StateResourceIdentifier without checking for non-null required values
     * @return StateResourceIdentifier
     */
    public StateResourceIdentifier buildUnchecked() {
        return new StateResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of StateResourceIdentifierBuilder
     * @return builder 
     */
    public static StateResourceIdentifierBuilder of() {
        return new StateResourceIdentifierBuilder();
    }

    /**
     * create builder for StateResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateResourceIdentifierBuilder of(final StateResourceIdentifier template) {
        StateResourceIdentifierBuilder builder = new StateResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
