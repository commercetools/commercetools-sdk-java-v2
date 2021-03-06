
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeDraftImpl.class)
public interface TypeDraft {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>The IDs of the resources that can be customized with this type.</p>
    */
    @NotNull
    @JsonProperty("resourceTypeIds")
    public List<ResourceTypeId> getResourceTypeIds();

    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setResourceTypeIds(final ResourceTypeId... resourceTypeIds);

    public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);

    @JsonIgnore
    public void setFieldDefinitions(final FieldDefinition... fieldDefinitions);

    public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);

    public static TypeDraft of() {
        return new TypeDraftImpl();
    }

    public static TypeDraft of(final TypeDraft template) {
        TypeDraftImpl instance = new TypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    public static TypeDraftBuilder builder() {
        return TypeDraftBuilder.of();
    }

    public static TypeDraftBuilder builder(final TypeDraft template) {
        return TypeDraftBuilder.of(template);
    }

    default <T> T withTypeDraft(Function<TypeDraft, T> helper) {
        return helper.apply(this);
    }
}
