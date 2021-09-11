package com.moviewiki.api.nation.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name="NATIONS")
public class Nation {

	@Id
	private @Column(name = "NATION_ID") String nationId;

	private @Column(name = "NATION_NAME") String nationName;

}
