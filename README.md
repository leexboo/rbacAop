# 基于aop和rbac的api级别的权限控制
**思路**
- 定义用户-角色-权限三级关系，实现用户与权限的解耦
- 自定义权限注解
- 在需要进行权限验证的接口上加上注解，设置具体的权限值
- 用户在登录后，获取用户的所有权限列表放入redis缓存中
- 定义aop，获取接口注解的权限值，和redis中的数据校验用户是否存在该权限，如果redis中没有，则从数据库中获取用户权限列表，再进行校验
