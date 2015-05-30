import java.util.ArrayList;


public class ListTalents {
	private ArrayList<Talent> talents;
	
	public ListTalents()
	{	// strength talents first
		Talent strength1, buzz, truegrit, strength2, position, regeneration, brawl, strength3, vigor, knockdownres, survivalinstinct, 
		strength4, resistbleed, stoneskin, aggression, strength5, woundresist, addvit, 
		//now dex
		dex1, flaying, predator, dex2, deflectarrow, repel, fistfight, dex3, resistblind, agility, limitincinerat, dex4, finesse, feint, 
		incinerateresist, dex5, vigilance, precision, 
		//now stamina
		sta1, heavyweight, mutation, sta2, absorption, poisonresist, enduranceregen, sta3, enduranceregen2, painresist, revive, sta4, 
		stunresist, brawn, altermetab, sta5, potiontolerance, addendurance, 
		//now int 
		int1, potionbrew, risingmoon, int2, herbalism, monsterlore, oilprep, int3, knowledgeclean, ingredientextract, bombprep, int4, 
		focus, knowledgelife, magicfrenzy, int5, mentalendurance, intensity, 
		//now signs -- aard
		aard1, stun, student, aard2, disarm, gust, apprentice, aard3, blastingfist, thunder, specialist, aard4, extenduration, 
		addedefficiency, expert, aard5, gale, master, 
		//igni
		igni1, harmsway1, studentigni, igni2, harmsway2, incineration, apprenticeigni, igni3, burningblade, walloffire, specialistigni, 
		igni4, inferno, addedefficiencyigni, expertigni, igni5, extendurationigni, masterigni, 
		//quen
		quen1, barrier1, studentquen, quen2, barrier2, extendurationquen, apprenticequen, quen3, barrier3, addintensityquen, specialistquen, 
		quen4, survivalzone, addedefficiencyquen, expertquen, quen5, resonance, masterquen, 
		//axii
		axi1, spellaxi, studentaxi, axi2, hypno, extendurationaxi1, apprenticeaxi, axi3, faze, extendurationaxi2, specialistaxi, axi4, 
		terror, addedefficiencyaxi, expertaxi, axi5, ally, masteraxi, 
		//yrden
		yrd1, painsign, studentyrd, yrd2, prowess, inscriptions, apprenticeyrd, yrd3, stuporsign, cripplsign, specialistyrd, yrd4, 
		blindsign, addedefficiencyrd, expertyrd, yrd5, circldeath, masteryrd, 
		//strong steel sword
		strngsteel1, cutjug1, crushblow1, bloodrage1, strngsteel2, cutjug2, crushblow2, bloodrage2, strngsteel3, cutjug3, crushblow3, 
		bloodrage3, strngsteel4, strngsteel5, 
		//fast steel
		faststeel1, paralysis1, hailblow1, sever1, faststeel2, paralysis2, hailblow2, sever2, faststeel3, paralysis3, hailblow3, sever3, 
		faststeel4, faststeel5, 
		//group steel
		grpsteel1, precisehit1, halfspin1, trip1, grpsteel2, precisehit2, halfspin2, trip2, grpsteel3, precisehit3, halfspin3, trip3, 
		grpsteel4, grpsteel5, 
		//strong silver
		strngsilv1, deepcut1, mortalblow1, patinado1, strngsilv2, deepcut2, mortalblow2, patinado2, strngsilv3, deepcut3, mortablblow3, 
		patinado3, strngsilv4, strngsilv5, 
		//fast silver
		fastsilv1, cripplpain1, flashcuts1, sinister1, fastsilv2, cripplpain2, flashcuts2, sinister2, fastsilv3, cripplpain3, flashcuts3, 
		sinister3, fastsilv4, fastsilv5, 
		//group silver
		grpsilv1, crithit1, tempest1, knockdown1, groupsilv2, crithit2, tempest2, knockdown2, grpsilv3, crithit3, tempest3, knockdown3, 
		grpsilv4, grpsilv5;
		
		strength1 = new Talent(5, 5, 10);
		buzz = new Talent(1, 2, 3);
		truegrit = new Talent(5, 5, 10);
		strength2 = new Talent(5, 5, 10);
		
	}

}
