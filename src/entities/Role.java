package entities;

import java.io.Serializable;

/**
 * Role entity
 */
public class Role implements Serializable {

	private static final long serialVersionUID = 6767829038192926154L;

	private String roleId;
	private String roleName;

	/**
	 * to create empty object
	 */
	public Role() {
		super();
	}

	/**
	 * 
	 * @param roleId
	 * @param roleName
	 */
	public Role(String roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	/**
	 * 
	 * @return String
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * 
	 * @return String
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 
	 * @param roleid
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * 
	 * @param rolename
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
