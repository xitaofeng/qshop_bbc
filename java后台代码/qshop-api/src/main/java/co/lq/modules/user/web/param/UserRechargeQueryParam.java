package co.lq.modules.user.web.param;

import co.lq.common.web.param.QueryParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户充值表 查询参数对象
 * </p>
 *
 * @author billy
 * @date 2019-12-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserRechargeQueryParam对象", description = "用户充值表查询参数")
public class UserRechargeQueryParam extends QueryParam {
    private static final long serialVersionUID = 1L;
}
