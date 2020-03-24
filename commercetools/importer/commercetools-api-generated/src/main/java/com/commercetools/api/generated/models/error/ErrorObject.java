package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.AccessDeniedError;
import com.commercetools.api.generated.models.error.ConcurrentModificationError;
import com.commercetools.api.generated.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.generated.models.error.DuplicateAttributeValueError;
import com.commercetools.api.generated.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.generated.models.error.DuplicateFieldError;
import com.commercetools.api.generated.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.generated.models.error.DuplicatePriceScopeError;
import com.commercetools.api.generated.models.error.DuplicateVariantValuesError;
import com.commercetools.api.generated.models.error.EnumValueIsUsedError;
import com.commercetools.api.generated.models.error.ExtensionBadResponseError;
import com.commercetools.api.generated.models.error.ExtensionNoResponseError;
import com.commercetools.api.generated.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.api.generated.models.error.InsufficientScopeError;
import com.commercetools.api.generated.models.error.InvalidCredentialsError;
import com.commercetools.api.generated.models.error.InvalidCurrentPasswordError;
import com.commercetools.api.generated.models.error.InvalidFieldError;
import com.commercetools.api.generated.models.error.InvalidInputError;
import com.commercetools.api.generated.models.error.InvalidItemShippingDetailsError;
import com.commercetools.api.generated.models.error.InvalidJsonInputError;
import com.commercetools.api.generated.models.error.InvalidOperationError;
import com.commercetools.api.generated.models.error.InvalidSubjectError;
import com.commercetools.api.generated.models.error.InvalidTokenError;
import com.commercetools.api.generated.models.error.MatchingPriceNotFoundError;
import com.commercetools.api.generated.models.error.MissingTaxRateForCountryError;
import com.commercetools.api.generated.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.generated.models.error.OutOfStockError;
import com.commercetools.api.generated.models.error.PriceChangedError;
import com.commercetools.api.generated.models.error.ReferenceExistsError;
import com.commercetools.api.generated.models.error.RequiredFieldError;
import com.commercetools.api.generated.models.error.ResourceNotFoundError;
import com.commercetools.api.generated.models.error.ShippingMethodDoesNotMatchCartError;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ExtensionBadResponseErrorImpl.class, name = "ExtensionBadResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ExtensionNoResponseErrorImpl.class, name = "ExtensionNoResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ExtensionUpdateActionsFailedErrorImpl.class, name = "ExtensionUpdateActionsFailed"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidCurrentPasswordErrorImpl.class, name = "InvalidCurrentPassword"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidInputErrorImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidItemShippingDetailsErrorImpl.class, name = "InvalidItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidJsonInputErrorImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidOperationErrorImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidSubjectErrorImpl.class, name = "InvalidSubject"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.MatchingPriceNotFoundErrorImpl.class, name = "MatchingPriceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.MissingTaxRateForCountryErrorImpl.class, name = "MissingTaxRateForCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.NoMatchingProductDiscountFoundErrorImpl.class, name = "NoMatchingProductDiscountFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.OutOfStockErrorImpl.class, name = "OutOfStock"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.PriceChangedErrorImpl.class, name = "PriceChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ReferenceExistsErrorImpl.class, name = "ReferenceExists"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = "ShippingMethodDoesNotMatchCart"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DiscountCodeNonApplicableErrorImpl.class, name = "DiscountCodeNonApplicable"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = "DuplicateFieldWithConflictingResource"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicatePriceScopeErrorImpl.class, name = "DuplicatePriceScope"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.error.EnumValueIsUsedErrorImpl.class, name = "EnumValueIsUsed")
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