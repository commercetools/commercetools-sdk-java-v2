package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.order.OrderReference;
import java.lang.Object;
import com.commercetools.api.models.me.ReplicaMyCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ReplicaMyCartDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReplicaMyCartDraft replicaMyCartDraft = ReplicaMyCartDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReplicaMyCartDraftImpl.class)
public interface ReplicaMyCartDraft extends io.vrap.rmf.base.client.Draft<ReplicaMyCartDraft> {


    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @return reference
     */
    @NotNull
    @JsonProperty("reference")
    public Object getReference();

    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @param reference value to be set
     */
    
    public void setReference(final CartReference reference);
    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @param reference value to be set
     */
    
    public void setReference(final OrderReference reference);
    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @param reference value to be set
     */
    
    public void setReference(final Object reference);

    /**
     * factory method
     * @return instance of ReplicaMyCartDraft
     */
    public static ReplicaMyCartDraft of(){
        return new ReplicaMyCartDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ReplicaMyCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReplicaMyCartDraft of(final ReplicaMyCartDraft template) {
        ReplicaMyCartDraftImpl instance = new ReplicaMyCartDraftImpl();
        instance.setReference(template.getReference());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReplicaMyCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReplicaMyCartDraft deepCopy(@Nullable final ReplicaMyCartDraft template) {
        if (template == null) {
            return null;
        }
        ReplicaMyCartDraftImpl instance = new ReplicaMyCartDraftImpl();
        instance.setReference(template.getReference());
        return instance;
    }

    /**
     * builder factory method for ReplicaMyCartDraft
     * @return builder
     */
    public static ReplicaMyCartDraftBuilder builder() {
        return ReplicaMyCartDraftBuilder.of();
    }
    
    /**
     * create builder for ReplicaMyCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReplicaMyCartDraftBuilder builder(final ReplicaMyCartDraft template) {
        return ReplicaMyCartDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReplicaMyCartDraft(Function<ReplicaMyCartDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReplicaMyCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplicaMyCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReplicaMyCartDraft>";
            }
        };
    }
}
