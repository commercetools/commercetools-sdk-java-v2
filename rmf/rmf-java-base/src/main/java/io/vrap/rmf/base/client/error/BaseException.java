
package io.vrap.rmf.base.client.error;

/**
 * <h2>Exception hierarchy</h2>
 * <img src="exceptionhierarchy.svg" alt="Exception hierarchy">
 *
 * @startuml exceptionhierarchy.svg
 * title Exception hierarchy
 * skinparam groupInheritance 2
 * package io.vrap.rmf.base.client.utils.json {
 *     class JsonException extends io.vrap.rmf.base.client.error.BaseException
 * }
 * package io.vrap.rmf.base.client.error {
 *   class BaseException
 *   class JsonException extends BaseException
 *   class FileException extends BaseException
 *   class ApiHttpException extends BaseException
 *   class RmfTimeoutException extends BaseException
 *
 *   class ApiClientException extends ApiHttpException
 *   class ApiServerException extends ApiHttpException
 *   class AuthException extends ApiHttpException
 *
 *   class BadGateWayException extends ApiServerException
 *   class GatewayTimeoutException extends ApiServerException
 *   class InternalServerErrorException extends ApiServerException
 *   class ServiceUnavailableException extends ApiServerException
 *
 *   class BadRequestException extends ApiClientException
 *   class ConcurrentModification extends ApiClientException
 *   class ForbiddenException extends ApiClientException
 *   class NotFoundException extends ApiClientException
 *   class UnauthorizedException extends ApiClientException
 * }
 * @enduml
 */
public class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(final String message) {
        super(message);
    }

    public BaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BaseException(final Throwable cause) {
        super(cause);
    }

    public BaseException(final String message, final Throwable cause, final boolean enableSuppression,
            final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
