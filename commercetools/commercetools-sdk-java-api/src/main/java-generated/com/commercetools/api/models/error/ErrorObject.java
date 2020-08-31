package com.commercetools.api.models.error;

import com.commercetools.api.models.error.AccessDeniedError;
import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import com.commercetools.api.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.models.error.DuplicateFieldError;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.DuplicateVariantValuesError;
import com.commercetools.api.models.error.EnumValueIsUsedError;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import com.commercetools.api.models.error.ExtensionNoResponseError;
import com.commercetools.api.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.api.models.error.InsufficientScopeError;
import com.commercetools.api.models.error.InvalidCredentialsError;
import com.commercetools.api.models.error.InvalidCurrentPasswordError;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.error.InvalidInputError;
import com.commercetools.api.models.error.InvalidItemShippingDetailsError;
import com.commercetools.api.models.error.InvalidJsonInputError;
import com.commercetools.api.models.error.InvalidOperationError;
import com.commercetools.api.models.error.InvalidSubjectError;
import com.commercetools.api.models.error.InvalidTokenError;
import com.commercetools.api.models.error.LanguageUsedInStoresError;
import com.commercetools.api.models.error.MatchingPriceNotFoundError;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.OutOfStockError;
import com.commercetools.api.models.error.PriceChangedError;
import com.commercetools.api.models.error.ReferenceExistsError;
import com.commercetools.api.models.error.RequiredFieldError;
import com.commercetools.api.models.error.ResourceNotFoundError;
import com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionBadResponseErrorImpl.class, name = "ExtensionBadResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionNoResponseErrorImpl.class, name = "ExtensionNoResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorImpl.class, name = "ExtensionUpdateActionsFailed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCurrentPasswordErrorImpl.class, name = "InvalidCurrentPassword"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidInputErrorImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidItemShippingDetailsErrorImpl.class, name = "InvalidItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidJsonInputErrorImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidOperationErrorImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidSubjectErrorImpl.class, name = "InvalidSubject"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.LanguageUsedInStoresErrorImpl.class, name = "LanguageUsedInStores"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MatchingPriceNotFoundErrorImpl.class, name = "MatchingPriceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MissingTaxRateForCountryErrorImpl.class, name = "MissingTaxRateForCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorImpl.class, name = "NoMatchingProductDiscountFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.OutOfStockErrorImpl.class, name = "OutOfStock"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.PriceChangedErrorImpl.class, name = "PriceChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferenceExistsErrorImpl.class, name = "ReferenceExists"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = "ShippingMethodDoesNotMatchCart"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValueIsUsedErrorImpl.class, name = "EnumValueIsUsed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = "DuplicateFieldWithConflictingResource"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl.class, name = "DiscountCodeNonApplicable"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl.class, name = "DuplicatePriceScope")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "code",
    defaultImpl = ErrorObjectImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ErrorObject  {

    
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);



}
