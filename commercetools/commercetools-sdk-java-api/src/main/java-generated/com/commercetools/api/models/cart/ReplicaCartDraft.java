package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.cart.ReplicaCartDraftImpl;

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
 *  <p>Used for replicating an existing Cart or Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReplicaCartDraft replicaCartDraft = ReplicaCartDraft.builder()
 *             .reference(referenceBuilder -> referenceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ReplicaCartDraft> {


    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @return reference
     */
    @NotNull
    @Valid
    @JsonProperty("reference")
    public Reference getReference();
    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param reference value to be set
     */
    
    public void setReference(final Reference reference);
    
    
    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of ReplicaCartDraft
     */
    public static ReplicaCartDraft of(){
        return new ReplicaCartDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ReplicaCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReplicaCartDraft of(final ReplicaCartDraft template) {
        ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
        instance.setReference(template.getReference());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReplicaCartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReplicaCartDraft deepCopy(@Nullable final ReplicaCartDraft template) {
        if (template == null) {
            return null;
        }
        ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
        instance.setReference(com.commercetools.api.models.common.Reference.deepCopy(template.getReference()));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ReplicaCartDraft
     * @return builder
     */
    public static ReplicaCartDraftBuilder builder() {
        return ReplicaCartDraftBuilder.of();
    }
    
    /**
     * create builder for ReplicaCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReplicaCartDraftBuilder builder(final ReplicaCartDraft template) {
        return ReplicaCartDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReplicaCartDraft(Function<ReplicaCartDraft, T> helper) {
        return helper.apply(this);
    }
    @JsonIgnore
    @Deprecated
    public default void setReference(final Object reference) {
        setReference((Reference)reference);
    };
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReplicaCartDraft>";
            }
        };
    }
}
