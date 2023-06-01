package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelUpdateImpl;

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
 * ChannelUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelUpdate channelUpdate = ChannelUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChannelUpdateImpl.class)
public interface ChannelUpdate extends com.commercetools.api.models.ResourceUpdate<ChannelUpdate, ChannelUpdateAction, ChannelUpdateBuilder> {


    /**
     *  <p>Expected version of the Channel on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Update actions to be performed on the Channel.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ChannelUpdateAction> getActions();

    /**
     *  <p>Expected version of the Channel on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Update actions to be performed on the Channel.</p>
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final ChannelUpdateAction ...actions);
    /**
     *  <p>Update actions to be performed on the Channel.</p>
     * @param actions values to be set
     */
    
    public void setActions(final List<ChannelUpdateAction> actions);

    /**
     * factory method
     * @return instance of ChannelUpdate
     */
    public static ChannelUpdate of(){
        return new ChannelUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy ChannelUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelUpdate of(final ChannelUpdate template) {
        ChannelUpdateImpl instance = new ChannelUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelUpdate deepCopy(@Nullable final ChannelUpdate template) {
        if (template == null) {
            return null;
        }
        ChannelUpdateImpl instance = new ChannelUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.channel.ChannelUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelUpdate
     * @return builder
     */
    public static ChannelUpdateBuilder builder() {
        return ChannelUpdateBuilder.of();
    }
    
    /**
     * create builder for ChannelUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelUpdateBuilder builder(final ChannelUpdate template) {
        return ChannelUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelUpdate(Function<ChannelUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelUpdate>";
            }
        };
    }
}
