package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLMissingRoleOnChannelErrorImpl;

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
 *  <p>Returned when one of the following states occur:</p>
 *  <ul>
 *   <li>Channel is added or set on a Store with missing Channel <code>roles</code>.</li>
 *   <li>Standalone Price references a Channel that does not contain the <code>ProductDistribution</code> role.</li>
 *  </ul>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Add Distribution Channel, Set Distribution Channel, Add Supply Channel, and Set Supply Channel update actions.</li>
 *   <li>Create a Standalone Price request.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingRoleOnChannelError graphQLMissingRoleOnChannelError = GraphQLMissingRoleOnChannelError.builder()
 *             .missingRole(ChannelRoleEnum.INVENTORY_SUPPLY)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLMissingRoleOnChannelErrorImpl.class)
public interface GraphQLMissingRoleOnChannelError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMissingRoleOnChannelError
     */
    String MISSING_ROLE_ON_CHANNEL = "MissingRoleOnChannel";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();
    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @return missingRole
     */
    @NotNull
    @JsonProperty("missingRole")
    public ChannelRoleEnum getMissingRole();

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @param channel value to be set
     */
    
    public void setChannel(final ChannelResourceIdentifier channel);
    
    
    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @param missingRole value to be set
     */
    
    public void setMissingRole(final ChannelRoleEnum missingRole);
    

    /**
     * factory method
     * @return instance of GraphQLMissingRoleOnChannelError
     */
    public static GraphQLMissingRoleOnChannelError of(){
        return new GraphQLMissingRoleOnChannelErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLMissingRoleOnChannelError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMissingRoleOnChannelError of(final GraphQLMissingRoleOnChannelError template) {
        GraphQLMissingRoleOnChannelErrorImpl instance = new GraphQLMissingRoleOnChannelErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setChannel(template.getChannel());
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLMissingRoleOnChannelError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMissingRoleOnChannelError deepCopy(@Nullable final GraphQLMissingRoleOnChannelError template) {
        if (template == null) {
            return null;
        }
        GraphQLMissingRoleOnChannelErrorImpl instance = new GraphQLMissingRoleOnChannelErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setChannel(com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    /**
     * builder factory method for GraphQLMissingRoleOnChannelError
     * @return builder
     */
    public static GraphQLMissingRoleOnChannelErrorBuilder builder() {
        return GraphQLMissingRoleOnChannelErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLMissingRoleOnChannelError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingRoleOnChannelErrorBuilder builder(final GraphQLMissingRoleOnChannelError template) {
        return GraphQLMissingRoleOnChannelErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMissingRoleOnChannelError(Function<GraphQLMissingRoleOnChannelError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingRoleOnChannelError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingRoleOnChannelError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMissingRoleOnChannelError>";
            }
        };
    }
}
