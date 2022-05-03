
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionImpl.class)
public interface ProductSelection extends BaseResource, com.commercetools.api.models.DomainResource<ProductSelection>,
        com.commercetools.api.models.Customizable<ProductSelection> {

    /**
    *  <p>Platform-generated unique identifier of the Product Selection.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the Product Selection.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the Product Selection was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the Product Selection was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1/02/2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1/02/2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-defined unique identifier of the Product Selection.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Name of the Product Selection.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Number of Products that are currently assigned to this Product Selection.</p>
    */
    @NotNull
    @JsonProperty("productCount")
    public Integer getProductCount();

    /**
    *  <p>Specifies in which way the Products are assigned to the Product Selection. Currently, the only way of doing this is to specify each Product individually. Hence, the type is fixed to <code>individual</code> for now, but we have plans to add other types in the future.</p>
    */
    @NotNull
    @JsonProperty("type")
    public ProductSelectionTypeEnum getType();

    /**
    *  <p>Custom Fields of this Product Selection.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    public void setProductCount(final Integer productCount);

    public void setType(final ProductSelectionTypeEnum type);

    public void setCustom(final CustomFields custom);

    public static ProductSelection of() {
        return new ProductSelectionImpl();
    }

    public static ProductSelection of(final ProductSelection template) {
        ProductSelectionImpl instance = new ProductSelectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductCount(template.getProductCount());
        instance.setType(template.getType());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ProductSelectionBuilder builder() {
        return ProductSelectionBuilder.of();
    }

    public static ProductSelectionBuilder builder(final ProductSelection template) {
        return ProductSelectionBuilder.of(template);
    }

    default <T> T withProductSelection(Function<ProductSelection, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelection>";
            }
        };
    }
}
