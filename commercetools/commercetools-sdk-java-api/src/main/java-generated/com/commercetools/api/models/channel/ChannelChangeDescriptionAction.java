package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.channel.ChannelChangeDescriptionActionImpl;

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
 * ChannelChangeDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelChangeDescriptionAction channelChangeDescriptionAction = ChannelChangeDescriptionAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChannelChangeDescriptionActionImpl.class)
public interface ChannelChangeDescriptionAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelChangeDescriptionAction
     */
    String CHANGE_DESCRIPTION = "changeDescription";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return description
     */
    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    

    /**
     * factory method
     * @return instance of ChannelChangeDescriptionAction
     */
    public static ChannelChangeDescriptionAction of(){
        return new ChannelChangeDescriptionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ChannelChangeDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelChangeDescriptionAction of(final ChannelChangeDescriptionAction template) {
        ChannelChangeDescriptionActionImpl instance = new ChannelChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelChangeDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelChangeDescriptionAction deepCopy(@Nullable final ChannelChangeDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ChannelChangeDescriptionActionImpl instance = new ChannelChangeDescriptionActionImpl();
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ChannelChangeDescriptionAction
     * @return builder
     */
    public static ChannelChangeDescriptionActionBuilder builder() {
        return ChannelChangeDescriptionActionBuilder.of();
    }
    
    /**
     * create builder for ChannelChangeDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelChangeDescriptionActionBuilder builder(final ChannelChangeDescriptionAction template) {
        return ChannelChangeDescriptionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelChangeDescriptionAction(Function<ChannelChangeDescriptionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelChangeDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelChangeDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelChangeDescriptionAction>";
            }
        };
    }
}
