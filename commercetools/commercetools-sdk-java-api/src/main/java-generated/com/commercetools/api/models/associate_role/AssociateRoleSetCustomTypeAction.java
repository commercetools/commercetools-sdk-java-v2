package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeActionImpl;

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
 * AssociateRoleSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetCustomTypeAction associateRoleSetCustomTypeAction = AssociateRoleSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssociateRoleSetCustomTypeActionImpl.class)
public interface AssociateRoleSetCustomTypeAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of AssociateRoleSetCustomTypeAction
     */
    public static AssociateRoleSetCustomTypeAction of(){
        return new AssociateRoleSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleSetCustomTypeAction of(final AssociateRoleSetCustomTypeAction template) {
        AssociateRoleSetCustomTypeActionImpl instance = new AssociateRoleSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleSetCustomTypeAction deepCopy(@Nullable final AssociateRoleSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleSetCustomTypeActionImpl instance = new AssociateRoleSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleSetCustomTypeAction
     * @return builder
     */
    public static AssociateRoleSetCustomTypeActionBuilder builder() {
        return AssociateRoleSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetCustomTypeActionBuilder builder(final AssociateRoleSetCustomTypeAction template) {
        return AssociateRoleSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleSetCustomTypeAction(Function<AssociateRoleSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleSetCustomTypeAction>";
            }
        };
    }
}
