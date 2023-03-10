package com.example.demo.model.characteristic;

import com.example.demo.model.posts.dto.PostsUpdateRequestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CharacteristicUpdateRequestDto {

	private String id;
	private String relation;
	private String rest_style;
	private String life_style;
	private String share;
	private String shower;
	private String clean;
	private String guest;

	@Override
	public String toString() {
		return "CharacteristicUpdateRequestDto [id=" + id + ", relation=" + relation + ", rest_style=" + rest_style
				+ ", life_style=" + life_style + ", share=" + share + ", shower=" + shower + ", clean=" + clean
				+ ", guest=" + guest + ", getId()=" + getId() + ", getRelation()=" + getRelation()
				+ ", getRest_style()=" + getRest_style() + ", getLife_style()=" + getLife_style() + ", getShare()="
				+ getShare() + ", getShower()=" + getShower() + ", getClean()=" + getClean() + ", getGuest()="
				+ getGuest() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Builder
	public CharacteristicUpdateRequestDto(String id, String relation, String rest_style, String life_style,
			String share, String shower, String clean, String guest) {
		this.id = id;
		this.relation = relation;
		this.rest_style = rest_style;
		this.life_style = life_style;
		this.share = share;
		this.shower = shower;
		this.clean = clean;
		this.guest = guest;
	}

}
