
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupUpdate attributeGroupUpdate = AttributeGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupUpdateImpl.class)
public interface AttributeGroupUpdate extends
        com.commercetools.api.models.ResourceUpdate<AttributeGroupUpdate, AttributeGroupUpdateAction, AttributeGroupUpdateBuilder> {

    /**
     *  <p>Expected version of the AttributeGroup on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<AttributeGroupUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final AttributeGroupUpdateAction... actions);

    public void setActions(final List<AttributeGroupUpdateAction> actions);

    public static AttributeGroupUpdate of() {
        return new AttributeGroupUpdateImpl();
    }

    public static AttributeGroupUpdate of(final AttributeGroupUpdate template) {
        AttributeGroupUpdateImpl instance = new AttributeGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static AttributeGroupUpdateBuilder builder() {
        return AttributeGroupUpdateBuilder.of();
    }

    public static AttributeGroupUpdateBuilder builder(final AttributeGroupUpdate template) {
        return AttributeGroupUpdateBuilder.of(template);
    }

    default <T> T withAttributeGroupUpdate(Function<AttributeGroupUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupUpdate>";
            }
        };
    }
}
