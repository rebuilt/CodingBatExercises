/*
Utility methods

*/
package utils;

public class Utils {

	public static void print(int [] nums) {
		for(int i = 0 ; i < nums.length-1; i ++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println(nums[nums.length-1]);
	}


	
	public static void print(String[] words) {
		for(int i = 0 ; i < words.length-1; i ++) {
			System.out.print(words[i] + ", ");
		}
		System.out.println(words[words.length-1]);	
	}
	public static void print(boolean[] bools) {
		for(int i = 0; i < bools.length-1; i++) {
			System.out.print(bools[i] + ", ");
		}
		System.out.println(bools[bools.length-1]);
		
	}
	
	public boolean started = false;
	private static long startTime = 0;
	public static  void startTimer() {
		startTime = System.currentTimeMillis();
	}
	public static void stopTimer() {
		if(startTime!= 0)
		System.out.println(System.currentTimeMillis() - startTime);
	}
	public static String getText() {
		return "E-text prepared by Suzanne Shell, Beth Trapaga, Charles Franks, and the\r\n" + 
				"Online Distributed Proofreading Team\r\n" + 
				"\r\n" + 
				"THE KING IN YELLOW\r\n" + 
				"\r\n" + 
				"BY\r\n" + 
				"\r\n" + 
				"ROBERT W. CHAMBERS\r\n" + 
				"\r\n" + 
				"Original publication date: 1895\r\n" + 
				"\r\n" + 
				"THE KING IN YELLOW\r\n" + 
				"IS DEDICATED\r\n" + 
				"TO\r\n" + 
				"MY BROTHER\r\n" + 
				"\r\n" + 
				" Along the shore the cloud waves break,\r\n" + 
				"The twin suns sink beneath the lake,\r\n" + 
				"The shadows lengthen\r\n" + 
				"In Carcosa.\r\n" + 
				"\r\n" + 
				" Strange is the night where black stars rise,\r\n" + 
				"And strange moons circle through the skies\r\n" + 
				"But stranger still is\r\n" + 
				"Lost Carcosa.\r\n" + 
				"\r\n" + 
				" Songs that the Hyades shall sing,\r\n" + 
				"Where flap the tatters of the King,\r\n" + 
				"Must die unheard in\r\n" + 
				"Dim Carcosa.\r\n" + 
				"\r\n" + 
				" Song of my soul, my voice is dead;\r\n" + 
				"Die thou, unsung, as tears unshed\r\n" + 
				"Shall dry and die in\r\n" + 
				"Lost Carcosa.\r\n" + 
				"\r\n" + 
				"Cassilda's Song in \"The King in Yellow,\" Act i, Scene 2.\r\n" + 
				"\r\n" + 
				"THE REPAIRER OF REPUTATIONS\r\n" + 
				"\r\n" + 
				"I\r\n" + 
				"\r\n" + 
				"\"Ne raillons pas les fous; leur folie dure plus longtemps que\r\n" + 
				"la notre.... Voila toute la difference.\"\r\n" + 
				"\r\n" + 
				"Toward the end of the year 1920 the Government of the United States had\r\n" + 
				"practically completed the programme, adopted during the last months of\r\n" + 
				"President Winthrop's administration. The country was apparently tranquil.\r\n" + 
				"Everybody knows how the Tariff and Labour questions were settled. The war\r\n" + 
				"with Germany, incident on that country's seizure of the Samoan Islands,\r\n" + 
				"had left no visible scars upon the republic, and the temporary occupation\r\n" + 
				"of Norfolk by the invading army had been forgotten in the joy over\r\n" + 
				"repeated naval victories, and the subsequent ridiculous plight of General\r\n" + 
				"Von Gartenlaube's forces in the State of New Jersey. The Cuban and\r\n" + 
				"Hawaiian investments had paid one hundred per cent and the territory of\r\n" + 
				"Samoa was well worth its cost as a coaling station. The country was in a\r\n" + 
				"superb state of defence. Every coast city had been well supplied with land\r\n" + 
				"fortifications; the army under the parental eye of the General Staff,\r\n" + 
				"organized according to the Prussian system, had been increased to 300,000\r\n" + 
				"men, with a territorial reserve of a million; and six magnificent\r\n" + 
				"squadrons of cruisers and battle-ships patrolled the six stations of the\r\n" + 
				"navigable seas, leaving a steam reserve amply fitted to control home\r\n" + 
				"waters. The gentlemen from the West had at last been constrained to\r\n" + 
				"acknowledge that a college for the training of diplomats was as necessary\r\n" + 
				"as law schools are for the training of barristers; consequently we were no\r\n" + 
				"longer represented abroad by incompetent patriots. The nation was\r\n" + 
				"prosperous; Chicago, for a moment paralyzed after a second great fire, had\r\n" + 
				"risen from its ruins, white and imperial, and more beautiful than the white\r\n" + 
				"city which had been built for its plaything in 1893. Everywhere good\r\n" + 
				"architecture was replacing bad, and even in New York, a sudden craving for\r\n" + 
				"decency had swept away a great portion of the existing horrors. Streets\r\n" + 
				"had been widened, properly paved and lighted, trees had been planted,\r\n" + 
				"squares laid out, elevated structures demolished and underground roads\r\n" + 
				"built to replace them. The new government buildings and barracks were fine\r\n" + 
				"bits of architecture, and the long system of stone quays which completely\r\n" + 
				"surrounded the island had been turned into parks which proved a god-send\r\n" + 
				"to the population. The subsidizing of the state theatre and state opera\r\n" + 
				"brought its own reward. The United States National Academy of Design was\r\n" + 
				"much like European institutions of the same kind. Nobody envied the\r\n" + 
				"Secretary of Fine Arts, either his cabinet position or his portfolio. The\r\n" + 
				"Secretary of Forestry and Game Preservation had a much easier time, thanks\r\n" + 
				"to the new system of National Mounted Police. We had profited well by the\r\n" + 
				"latest treaties with France and England; the exclusion of foreign-born\r\n" + 
				"Jews as a measure of self-preservation, the settlement of the new\r\n" + 
				"independent negro state of Suanee, the checking of immigration, the new\r\n" + 
				"laws concerning naturalization, and the gradual centralization of power in\r\n" + 
				"the executive all contributed to national calm and prosperity. When the\r\n" + 
				"Government solved the Indian problem and squadrons of Indian cavalry\r\n" + 
				"scouts in native costume were substituted for the pitiable organizations\r\n" + 
				"tacked on to the tail of skeletonized regiments by a former Secretary of\r\n" + 
				"War, the nation drew a long sigh of relief. When, after the colossal\r\n" + 
				"Congress of Religions, bigotry and intolerance were laid in their graves\r\n" + 
				"and kindness and charity began to draw warring sects together, many\r\n" + 
				"thought the millennium had arrived, at least in the new world which after\r\n" + 
				"all is a world by itself.\r\n" + 
				"\r\n" + 
				"But self-preservation is the first law, and the United States had to look\r\n" + 
				"on in helpless sorrow as Germany, Italy, Spain and Belgium writhed in the\r\n" + 
				"throes of Anarchy, while Russia, watching from the Caucasus, stooped and\r\n" + 
				"bound them one by one.\r\n" + 
				"\r\n" + 
				"In the city of New York the summer of 1899 was signalized by the\r\n" + 
				"dismantling of the Elevated Railroads. The summer of 1900 will live in\r\n" + 
				"the memories of New York people for many a cycle; the Dodge Statue was\r\n" + 
				"removed in that year. In the following winter began that agitation for\r\n" + 
				"the repeal of the laws prohibiting suicide which bore its final fruit in\r\n" + 
				"the month of April, 1920, when the first Government Lethal Chamber was\r\n" + 
				"opened on Washington Square.\r\n" + 
				"\r\n" + 
				"I had walked down that day from Dr. Archer's house on Madison Avenue,\r\n" + 
				"where I had been as a mere formality. Ever since that fall from my horse,\r\n" + 
				"four years before, I had been troubled at times with pains in the back of\r\n" + 
				"my head and neck, but now for months they had been absent, and the doctor\r\n" + 
				"sent me away that day saying there was nothing more to be cured in me. It\r\n" + 
				"was hardly worth his fee to be told that; I knew it myself. Still I did\r\n" + 
				"not grudge him the money. What I minded was the mistake which he made at\r\n" + 
				"first. When they picked me up from the pavement where I lay unconscious,\r\n" + 
				"and somebody had mercifully sent a bullet through my horse's head, I was\r\n" + 
				"carried to Dr. Archer, and he, pronouncing my brain affected, placed me\r\n" + 
				"in his private asylum where I was obliged to endure treatment for\r\n" + 
				"insanity. At last he decided that I was well, and I, knowing that my mind\r\n" + 
				"had always been as sound as his, if not sounder, \"paid my tuition\" as he\r\n" + 
				"jokingly called it, and left. I told him, smiling, that I would get even\r\n" + 
				"with him for his mistake, and he laughed heartily, and asked me to call\r\n" + 
				"once in a while. I did so, hoping for a chance to even up accounts, but\r\n" + 
				"he gave me none, and I told him I would wait.\r\n" + 
				"\r\n" + 
				"The fall from my horse had fortunately left no evil results; on the\r\n" + 
				"contrary it had changed my whole character for the better. From a lazy\r\n" + 
				"young man about town, I had become active, energetic, temperate, and\r\n" + 
				"above all--oh, above all else--ambitious. There was only one thing which\r\n" + 
				"troubled me, I laughed at my own uneasiness, and yet it troubled me.\r\n" + 
				"\r\n" + 
				"During my convalescence I had bought and read for the first time, _The\r\n" + 
				"King in Yellow_. I remember after finishing the first act that it\r\n" + 
				"occurred to me that I had better stop. I started up and flung the book\r\n" + 
				"into the fireplace; the volume struck the barred grate and fell open on\r\n" + 
				"the hearth in the firelight. If I had not caught a glimpse of the opening\r\n" + 
				"words in the second act I should never have finished it, but as I stooped\r\n" + 
				"to pick it up, my eyes became riveted to the open page, and with a cry of\r\n" + 
				"terror, or perhaps it was of joy so poignant that I suffered in every\r\n" + 
				"nerve, I snatched the thing out of the coals and crept shaking to my\r\n" + 
				"bedroom, where I read it and reread it, and wept and laughed and trembled\r\n" + 
				"with a horror which at times assails me yet. This is the thing that\r\n" + 
				"troubles me, for I cannot forget Carcosa where black stars hang in the\r\n" + 
				"heavens; where the shadows of men's thoughts lengthen in the afternoon,\r\n" + 
				"when the twin suns sink into the lake of Hali; and my mind will bear for\r\n" + 
				"ever the memory of the Pallid Mask. I pray God will curse the writer, as\r\n" + 
				"the writer has cursed the world with this beautiful, stupendous creation,\r\n" + 
				"terrible in its simplicity, irresistible in its truth--a world which now\r\n" + 
				"trembles before the King in Yellow. When the French Government seized the\r\n" + 
				"translated copies which had just arrived in Paris, London, of course,\r\n" + 
				"became eager to read it. It is well known how the book spread like an\r\n" + 
				"infectious disease, from city to city, from continent to continent,\r\n" + 
				"barred out here, confiscated there, denounced by Press and pulpit,\r\n" + 
				"censured even by the most advanced of literary anarchists. No definite\r\n" + 
				"principles had been violated in those wicked pages, no doctrine\r\n" + 
				"promulgated, no convictions outraged. It could not be judged by any known\r\n" + 
				"standard, yet, although it was acknowledged that the supreme note of art\r\n" + 
				"had been struck in _The King in Yellow_, all felt that human nature\r\n" + 
				"could not bear the strain, nor thrive on words in which the essence of\r\n" + 
				"purest poison lurked. The very banality and innocence of the first act\r\n" + 
				"only allowed the blow to fall afterward with more awful effect.\r\n" + 
				"\r\n" + 
				"It was, I remember, the 13th day of April, 1920, that the first\r\n" + 
				"Government Lethal Chamber was established on the south side of Washington\r\n" + 
				"Square, between Wooster Street and South Fifth Avenue. The block which\r\n" + 
				"had formerly consisted of a lot of shabby old buildings, used as cafes\r\n" + 
				"and restaurants for foreigners, had been acquired by the Government in\r\n" + 
				"the winter of 1898. The French and Italian cafes and restaurants were\r\n" + 
				"torn down; the whole block was enclosed by a gilded iron railing, and\r\n" + 
				"converted into a lovely garden with lawns, flowers and fountains. In the\r\n" + 
				"centre of the garden stood a small, white building, severely classical in\r\n" + 
				"architecture, and surrounded by thickets of flowers. Six Ionic columns\r\n" + 
				"supported the roof, and the single door was of bronze. A splendid marble\r\n" + 
				"group of the \"Fates\" stood before the door, the work of a young American\r\n" + 
				"sculptor, Boris Yvain, who had died in Paris when only twenty-three years\r\n" + 
				"old.\r\n" + 
				"\r\n" + 
				"The inauguration ceremonies were in progress as I crossed University\r\n" + 
				"Place and entered the square. I threaded my way through the silent throng\r\n" + 
				"of spectators, but was stopped at Fourth Street by a cordon of police. A\r\n" + 
				"regiment of United States lancers were drawn up in a hollow square round\r\n" + 
				"the Lethal Chamber. On a raised tribune facing Washington Park stood the\r\n" + 
				"Governor of New York, and behind him were grouped the Mayor of New\r\n" + 
				"York and Brooklyn, the Inspector-General of Police, the Commandant of\r\n" + 
				"the state troops, Colonel Livingston, military aid to the President of the\r\n" + 
				"United States, General Blount, commanding at Governor's Island,\r\n" + 
				"Major-General Hamilton, commanding the garrison of New York and Brooklyn,\r\n" + 
				"Admiral Buffby of the fleet in the North River, Surgeon-General\r\n" + 
				"Lanceford, the staff of the National Free Hospital, Senators Wyse and\r\n" + 
				"Franklin of New York, and the Commissioner of Public Works. The tribune\r\n" + 
				"was surrounded by a squadron of hussars of the National Guard.\r\n" + 
				"\r\n" + 
				"The Governor was finishing his reply to the short speech of the\r\n" + 
				"Surgeon-General. I heard him say: \"The laws prohibiting suicide and\r\n" + 
				"providing punishment for any attempt at self-destruction have been\r\n" + 
				"repealed. The Government has seen fit to acknowledge the right of man to\r\n" + 
				"end an existence which may have become intolerable to him, through\r\n" + 
				"physical suffering or mental despair. It is believed that the community\r\n" + 
				"will be benefited by the removal of such people from their midst. Since\r\n" + 
				"the passage of this law, the number of suicides in the United States has\r\n" + 
				"not increased. Now the Government has determined to establish a Lethal\r\n" + 
				"Chamber in every city, town and village in the country, it remains to be\r\n" + 
				"seen whether or not that class of human creatures from whose desponding\r\n" + 
				"ranks new victims of self-destruction fall daily will accept the relief\r\n" + 
				"thus provided.\" He paused, and turned to the white Lethal Chamber. The\r\n" + 
				"silence in the street was absolute. \"There a painless death awaits him\r\n" + 
				"who can no longer bear the sorrows of this life. If death is welcome let\r\n" + 
				"him seek it there.\" Then quickly turning to the military aid of the\r\n" + 
				"President's household, he said, \"I declare the Lethal Chamber open,\" and\r\n" + 
				"again facing the vast crowd he cried in a clear voice: \"Citizens of New\r\n" + 
				"York and of the United States of America, through me the Government\r\n" + 
				"declares the Lethal Chamber to be open.\"\r\n" + 
				"\r\n" + 
				"The solemn hush was broken by a sharp cry of command, the squadron of\r\n" + 
				"hussars filed after the Governor's carriage, the lancers wheeled and\r\n" + 
				"formed along Fifth Avenue to wait for the commandant of the garrison, and\r\n" + 
				"the mounted police followed them. I left the crowd to gape and stare at\r\n" + 
				"the white marble Death Chamber, and, crossing South Fifth Avenue, walked\r\n" + 
				"along the western side of that thoroughfare to Bleecker Street. Then I\r\n" + 
				"turned to the right and stopped before a dingy shop which bore the sign:\r\n" + 
				"\r\n" + 
				"HAWBERK, ARMOURER.\r\n" + 
				"\r\n" + 
				"I glanced in at the doorway and saw Hawberk busy in his little shop at\r\n" + 
				"the end of the hall. He looked up, and catching sight of me cried in his\r\n" + 
				"deep, hearty voice, \"Come in, Mr. Castaigne!\" Constance, his daughter,\r\n" + 
				"rose to meet me as I crossed the threshold, and held out her pretty\r\n" + 
				"hand, but I saw the blush of disappointment on her cheeks, and knew\r\n" + 
				"that it was another Castaigne she had expected, my cousin Louis. I\r\n" + 
				"smiled at her confusion and complimented her on the banner she was\r\n" + 
				"embroidering from a coloured plate. Old Hawberk sat riveting the worn\r\n" + 
				"greaves of some ancient suit of armour, and the ting! ting! ting! of his\r\n" + 
				"little hammer sounded pleasantly in the quaint shop. Presently he\r\n" + 
				"dropped his hammer, and fussed about for a moment with a tiny wrench.\r\n" + 
				"The soft clash of the mail sent a thrill of pleasure through me. I\r\n" + 
				"loved to hear the music of steel brushing against steel, the mellow\r\n" + 
				"shock of the mallet on thigh pieces, and the jingle of chain armour.\r\n" + 
				"That was the only reason I went to see Hawberk. He had never interested\r\n" + 
				"me personally, nor did Constance, except for the fact of her being in\r\n" + 
				"love with Louis. This did occupy my attention, and sometimes even kept\r\n" + 
				"me awake at night. But I knew in my heart that all would come right,\r\n" + 
				"and that I should arrange their future as I expected to arrange that of\r\n" + 
				"my kind doctor, John Archer. However, I should never have troubled\r\n" + 
				"myself about visiting them just then, had it not been, as I say, that\r\n" + 
				"the music of the tinkling hammer had for me this strong fascination. I\r\n" + 
				"would sit for hours, listening and listening, and when a stray sunbeam\r\n" + 
				"struck the inlaid steel, the sensation it gave me was almost too keen\r\n" + 
				"to endure. My eyes would become fixed, dilating with a pleasure that\r\n" + 
				"stretched every nerve almost to breaking, until some movement of the\r\n" + 
				"old armourer cut off the ray of sunlight, then, still thrilling\r\n" + 
				"secretly, I leaned back and listened again to the sound of the\r\n" + 
				"polishing rag, swish! swish! rubbing rust from the rivets.\r\n" + 
				"\r\n" + 
				"Constance worked with the embroidery over her knees, now and then pausing\r\n" + 
				"to examine more closely the pattern in the coloured plate from the\r\n" + 
				"Metropolitan Museum.\r\n" + 
				"\r\n" + 
				"\"Who is this for?\" I asked.\r\n" + 
				"\r\n" + 
				"Hawberk explained, that in addition to the treasures of armour in the\r\n" + 
				"Metropolitan Museum of which he had been appointed armourer, he also\r\n" + 
				"had charge of several collections belonging to rich amateurs. This was the\r\n" + 
				"missing greave of a famous suit which a client of his had traced to a\r\n" + 
				"little shop in Paris on the Quai d'Orsay. He, Hawberk, had negotiated for\r\n" + 
				"and secured the greave, and now the suit was complete. He laid down his\r\n" + 
				"hammer and read me the history of the suit, traced since 1450 from owner\r\n" + 
				"to owner until it was acquired by Thomas Stainbridge. When his superb\r\n" + 
				"collection was sold, this client of Hawberk's bought the suit, and since\r\n" + 
				"then the search for the missing greave had been pushed until it was,\r\n" + 
				"almost by accident, located in Paris.\r\n" + 
				"\r\n" + 
				"\"Did you continue the search so persistently without any certainty of the\r\n" + 
				"greave being still in existence?\" I demanded.\r\n" + 
				"\r\n" + 
				"\"Of course,\" he replied coolly.\r\n" + 
				"\r\n" + 
				"Then for the first time I took a personal interest in Hawberk.\r\n" + 
				"\r\n" + 
				"\"It was worth something to you,\" I ventured.\r\n" + 
				"\r\n" + 
				"\"No,\" he replied, laughing, \"my pleasure in finding it was my reward.\"\r\n" + 
				"\r\n" + 
				"\"Have you no ambition to be rich?\" I asked, smiling.\r\n" + 
				"\r\n" + 
				"\"My one ambition is to be the best armourer in the world,\" he answered\r\n" + 
				"gravely.\r\n" + 
				"\r\n" + 
				"Constance asked me if I had seen the ceremonies at the Lethal Chamber.\r\n" + 
				"She herself had noticed cavalry passing up Broadway that morning, and had\r\n" + 
				"wished to see the inauguration, but her father wanted the banner\r\n" + 
				"finished, and she had stayed at his request.\r\n" + 
				"\r\n" + 
				"\"Did you see your cousin, Mr. Castaigne, there?\" she asked, with the\r\n" + 
				"slightest tremor of her soft eyelashes.\r\n" + 
				"\r\n" + 
				"\"No,\" I replied carelessly. \"Louis' regiment is manoeuvring out in\r\n" + 
				"Westchester County.\" I rose and picked up my hat and cane.\r\n" + 
				"\r\n" + 
				"\"Are you going upstairs to see the lunatic again?\" laughed old Hawberk.\r\n" + 
				"If Hawberk knew how I loathe that word \"lunatic,\" he would never use it\r\n" + 
				"in my presence. It rouses certain feelings within me which I do not care\r\n" + 
				"to explain. However, I answered him quietly: \"I think I shall drop in and\r\n" + 
				"see Mr. Wilde for a moment or two.\"\r\n" + 
				"\r\n" + 
				"\"Poor fellow,\" said Constance, with a shake of the head, \"it must be hard\r\n" + 
				"to live alone year after year poor, crippled and almost demented. It is\r\n" + 
				"very good of you, Mr. Castaigne, to visit him as often as you do.\"\r\n" + 
				"\r\n" + 
				"\"I think he is vicious,\" observed Hawberk, beginning again with his\r\n" + 
				"hammer. I listened to the golden tinkle on the greave plates; when he had\r\n" + 
				"finished I replied:\r\n" + 
				"\r\n" + 
				"\"No, he is not vicious, nor is he in the least demented. His mind is a\r\n" + 
				"wonder chamber, from which he can extract treasures that you and I would\r\n" + 
				"give years of our life to acquire.\"'\r\n" + 
				"\r\n" + 
				"Hawberk laughed.\r\n" + 
				"\r\n" + 
				"I continued a little impatiently: \"He knows history as no one else could\r\n" + 
				"know it. Nothing, however trivial, escapes his search, and his memory is\r\n" + 
				"so absolute, so precise in details, that were it known in New York that\r\n" + 
				"such a man existed, the people could not honour him enough.\"\r\n" + 
				"\r\n" + 
				"\"Nonsense,\" muttered Hawberk, searching on the floor for a fallen rivet.\r\n" + 
				"\r\n" + 
				"\"Is it nonsense,\" I asked, managing to suppress what I felt, \"is it\r\n" + 
				"nonsense when he says that the tassets and cuissards of the enamelled\r\n" + 
				"suit of armour commonly known as the 'Prince's Emblazoned' can be found\r\n" + 
				"among a mass of rusty theatrical properties, broken stoves and\r\n" + 
				"ragpicker's refuse in a garret in Pell Street?\"\r\n" + 
				"\r\n" + 
				"Hawberk's hammer fell to the ground, but he picked it up and asked, with\r\n" + 
				"a great deal of calm, how I knew that the tassets and left cuissard were\r\n" + 
				"missing from the \"Prince's Emblazoned.\"\r\n" + 
				"\r\n" + 
				"\"I did not know until Mr. Wilde mentioned it to me the other day. He said\r\n" + 
				"they were in the garret of 998 Pell Street.\"\r\n" + 
				"\r\n" + 
				"\"Nonsense,\" he cried, but I noticed his hand trembling under his leathern\r\n" + 
				"apron.\r\n" + 
				"\r\n" + 
				"\"Is this nonsense too?\" I asked pleasantly, \"is it nonsense when Mr.\r\n" + 
				"Wilde continually speaks of you as the Marquis of Avonshire and of Miss\r\n" + 
				"Constance--\"\r\n" + 
				"\r\n" + 
				"I did not finish, for Constance had started to her feet with terror\r\n" + 
				"written on every feature. Hawberk looked at me and slowly smoothed his\r\n" + 
				"leathern apron.\r\n" + 
				"\r\n" + 
				"\"That is impossible,\" he observed, \"Mr. Wilde may know a great many\r\n" + 
				"things--\"\r\n" + 
				"\r\n" + 
				"\"About armour, for instance, and the 'Prince's Emblazoned,'\" I\r\n" + 
				"interposed, smiling.\r\n" + 
				"\r\n" + 
				"\"Yes,\" he continued, slowly, \"about armour also--may be--but he is wrong\r\n" + 
				"in regard to the Marquis of Avonshire, who, as you know, killed his\r\n" + 
				"wife's traducer years ago, and went to Australia where he did not long\r\n" + 
				"survive his wife.\"\r\n" + 
				"\r\n" + 
				"\"Mr. Wilde is wrong,\" murmured Constance. Her lips were blanched, but her\r\n" + 
				"voice was sweet and calm.\r\n" + 
				"\r\n" + 
				"\"Let us agree, if you please, that in this one circumstance Mr. Wilde is\r\n" + 
				"wrong,\" I said.\r\n" + 
				"\r\n" + 
				"II\r\n" + 
				"\r\n" + 
				"I climbed the three dilapidated flights of stairs, which I had so often\r\n" + 
				"climbed before, and knocked at a small door at the end of the corridor.\r\n" + 
				"Mr. Wilde opened the door and I walked in.\r\n" + 
				"\r\n" + 
				"When he had double-locked the door and pushed a heavy chest against it,\r\n" + 
				"he came and sat down beside me, peering up into my face with his little\r\n" + 
				"light-coloured eyes. Half a dozen new scratches covered his nose and\r\n" + 
				"cheeks, and the silver wires which supported his artificial ears had\r\n" + 
				"become displaced. I thought I had never seen him so hideously\r\n" + 
				"fascinating. He had no ears. The artificial ones, which now stood out at\r\n" + 
				"an angle from the fine wire, were his one weakness. They were made of wax\r\n" + 
				"and painted a shell pink, but the rest of his face was yellow. He might\r\n" + 
				"better have revelled in the luxury of some artificial fingers for his\r\n" + 
				"left hand, which was absolutely fingerless, but it seemed to cause him no\r\n" + 
				"inconvenience, and he was satisfied with his wax ears. He was very small,\r\n" + 
				"scarcely higher than a child of ten, but his arms were magnificently\r\n" + 
				"developed, and his thighs as thick as any athlete's. Still, the most\r\n" + 
				"remarkable thing about Mr. Wilde was that a man of his marvellous\r\n" + 
				"intelligence and knowledge should have such a head. It was flat and\r\n" + 
				"pointed, like the heads of many of those unfortunates whom people\r\n" + 
				"imprison in asylums for the weak-minded. Many called him insane, but I\r\n" + 
				"knew him to be as sane as I was.\r\n" + 
				"\r\n" + 
				"I do not deny that he was eccentric; the mania he had for keeping that\r\n" + 
				"cat and teasing her until she flew at his face like a demon, was\r\n" + 
				"certainly eccentric. I never could understand why he kept the creature,\r\n" + 
				"nor what pleasure he found in shutting himself up in his room with this\r\n" + 
				"surly, vicious beast. I remember once, glancing up from the manuscript I\r\n" + 
				"was studying by the light of some tallow dips, and seeing Mr. Wilde\r\n" + 
				"squatting motionless on his high chair, his eyes fairly blazing with\r\n" + 
				"excitement, while the cat, which had risen from her place before the\r\n" + 
				"stove, came creeping across the floor right at him. Before I could move\r\n" + 
				"she flattened her belly to the ground, crouched, trembled, and sprang\r\n" + 
				"into his face. Howling and foaming they rolled over and over on the\r\n" + 
				"floor, scratching and clawing, until the cat screamed and fled under the\r\n" + 
				"cabinet, and Mr. Wilde turned over on his back, his limbs contracting and\r\n" + 
				"curling up like the legs of a dying spider. He _was_ eccentric.\r\n" + 
				"\r\n" + 
				"Mr. Wilde had climbed into his high chair, and, after studying my face,\r\n" + 
				"picked up a dog's-eared ledger and opened it.\r\n" + 
				"\r\n" + 
				"\"Henry B. Matthews,\" he read, \"book-keeper with Whysot Whysot and\r\n" + 
				"Company, dealers in church ornaments. Called April 3rd. Reputation\r\n" + 
				"damaged on the race-track. Known as a welcher. Reputation to be repaired\r\n" + 
				"by August 1st. Retainer Five Dollars.\" He turned the page and ran his\r\n" + 
				"fingerless knuckles down the closely-written columns.\r\n" + 
				"\r\n" + 
				"\"P. Greene Dusenberry, Minister of the Gospel, Fairbeach, New Jersey.\r\n" + 
				"Reputation damaged in the Bowery. To be repaired as soon as possible.\r\n" + 
				"Retainer $100.\"\r\n" + 
				"\r\n" + 
				"He coughed and added, \"Called, April 6th.\"\r\n" + 
				"\r\n" + 
				"\"Then you are not in need of money, Mr. Wilde,\" I inquired.\r\n" + 
				"\r\n" + 
				"\"Listen,\" he coughed again.\r\n" + 
				"\r\n" + 
				"\"Mrs. C. Hamilton Chester, of Chester Park, New York City. Called April\r\n" + 
				"7th. Reputation damaged at Dieppe, France. To be repaired by October 1st\r\n" + 
				"Retainer $500.\r\n" + 
				"\r\n" + 
				"\"Note.--C. Hamilton Chester, Captain U.S.S. 'Avalanche', ordered home\r\n" + 
				"from South Sea Squadron October 1st.\"\r\n" + 
				"\r\n" + 
				"\"Well,\" I said, \"the profession of a Repairer of Reputations is\r\n" + 
				"lucrative.\"\r\n" + 
				"\r\n" + 
				"His colourless eyes sought mine, \"I only wanted to demonstrate that I\r\n" + 
				"was correct. You said it was impossible to succeed as a Repairer of\r\n" + 
				"Reputations; that even if I did succeed in certain cases it would cost\r\n" + 
				"me more than I would gain by it. To-day I have five hundred men in my\r\n" + 
				"employ, who are poorly paid, but who pursue the work with an enthusiasm\r\n" + 
				"which possibly may be born of fear. These men enter every shade and grade\r\n" + 
				"of society; some even are pillars of the most exclusive social temples;\r\n" + 
				"others are the prop and pride of the financial world; still others, hold\r\n" + 
				"undisputed sway among the 'Fancy and the Talent.' I choose them at my\r\n" + 
				"leisure from those who reply to my advertisements. It is easy enough,\r\n" + 
				"they are all cowards. I could treble the number in twenty days if I\r\n" + 
				"wished. So you see, those who have in their keeping the reputations of\r\n" + 
				"their fellow-citizens, I have in my pay.\"\r\n" + 
				"\r\n" + 
				"\"They may turn on you,\" I suggested.\r\n" + 
				"\r\n" + 
				"He rubbed his thumb over his cropped ears, and adjusted the wax\r\n" + 
				"substitutes. \"I think not,\" he murmured thoughtfully, \"I seldom have to\r\n" + 
				"apply the whip, and then only once. Besides they like their wages.\"\r\n" + 
				"\r\n" + 
				"\"How do you apply the whip?\" I demanded.\r\n" + 
				"\r\n" + 
				"His face for a moment was awful to look upon. His eyes dwindled to a pair\r\n" + 
				"of green sparks.\r\n" + 
				"\r\n" + 
				"\"I invite them to come and have a little chat with me,\" he said in a soft\r\n" + 
				"voice.\r\n" + 
				"\r\n" + 
				"A knock at the door interrupted him, and his face resumed its amiable\r\n" + 
				"expression.\r\n" + 
				"\r\n" + 
				"\"Who is it?\" he inquired.\r\n" + 
				"\r\n" + 
				"\"Mr. Steylette,\" was the answer.\r\n" + 
				"\r\n" + 
				"\"Come to-morrow,\" replied Mr. Wilde.\r\n" + 
				"\r\n" + 
				"\"Impossible,\" began the other, but was silenced by a sort of bark from\r\n" + 
				"Mr. Wilde.\r\n" + 
				"\r\n" + 
				"\"Come to-morrow,\" he repeated.\r\n" + 
				"\r\n" + 
				"We heard somebody move away from the door and turn the corner by the\r\n" + 
				"stairway.\r\n" + 
				"\r\n" + 
				"\"Who is that?\" I asked.\r\n" + 
				"\r\n" + 
				"\"Arnold Steylette, Owner and Editor in Chief of the great New York\r\n" + 
				"daily.\"\r\n" + 
				"\r\n" + 
				"He drummed on the ledger with his fingerless hand adding: \"I pay him very\r\n" + 
				"badly, but he thinks it a good bargain.\"\r\n" + 
				"\r\n" + 
				"\"Arnold Steylette!\" I repeated amazed.\r\n" + 
				"\r\n" + 
				"\"Yes,\" said Mr. Wilde, with a self-satisfied cough.\r\n" + 
				"\r\n" + 
				"The cat, which had entered the room as he spoke, hesitated, looked up at\r\n" + 
				"him and snarled. He climbed down from the chair and squatting on the\r\n" + 
				"floor, took the creature into his arms and caressed her. The cat ceased\r\n" + 
				"snarling and presently began a loud purring which seemed to increase in\r\n" + 
				"timbre as he stroked her. \"Where are the notes?\" I asked. He pointed to\r\n" + 
				"the table, and for the hundredth time I picked up the bundle of\r\n" + 
				"manuscript entitled--\r\n" + 
				"\r\n" + 
				"\"THE IMPERIAL DYNASTY OF AMERICA.\"\r\n" + 
				"\r\n" + 
				"One by one I studied the well-worn pages, worn only by my own handling,\r\n" + 
				"and although I knew all by heart, from the beginning, \"When from Carcosa,\r\n" + 
				"the Hyades, Hastur, and Aldebaran,\" to \"Castaigne, Louis de Calvados,\r\n" + 
				"born December 19th, 1877,\" I read it with an eager, rapt attention,\r\n" + 
				"pausing to repeat parts of it aloud, and dwelling especially on \"Hildred\r\n" + 
				"de Calvados, only son of Hildred Castaigne and Edythe Landes Castaigne,\r\n" + 
				"first in succession,\" etc., etc.\r\n" + 
				"\r\n" + 
				"When I finished, Mr. Wilde nodded and coughed.\r\n" + 
				"\r\n" + 
				"\"Speaking of your legitimate ambition,\" he said, \"how do Constance and\r\n" + 
				"Louis get along?\"\r\n" + 
				"\r\n" + 
				"\"She loves him,\" I replied simply.\r\n" + 
				"\r\n" + 
				"The cat on his knee suddenly turned and struck at his eyes, and he flung\r\n" + 
				"her off and climbed on to the chair opposite me.\r\n" + 
				"\r\n" + 
				"\"And Dr. Archer! But that's a matter you can settle any time you wish,\"\r\n" + 
				"he added.\r\n" + 
				"\r\n" + 
				"\"Yes,\" I replied, \"Dr. Archer can wait, but it is time I saw my cousin\r\n" + 
				"Louis.\"\r\n" + 
				"\r\n" + 
				"\"It is time,\" he repeated. Then he took another ledger from the table and\r\n" + 
				"ran over the leaves rapidly. \"We are now in communication with ten\r\n" + 
				"thousand men,\" he muttered. \"We can count on one hundred thousand within\r\n" + 
				"the first twenty-eight hours, and in forty-eight hours the state will\r\n" + 
				"rise _en masse_. The country follows the state, and the portion that\r\n" + 
				"will not, I mean California and the Northwest, might better never have\r\n" + 
				"been inhabited. I shall not send them the Yellow Sign.\"\r\n" + 
				"\r\n" + 
				"The blood rushed to my head, but I only answered, \"A new broom sweeps\r\n" + 
				"clean.\"\r\n" + 
				"\r\n" + 
				"\"The ambition of Caesar and of Napoleon pales before that which could not\r\n" + 
				"rest until it had seized the minds of men and controlled even their\r\n" + 
				"unborn thoughts,\" said Mr. Wilde.\r\n" + 
				"\r\n" + 
				"\"You are speaking of the King in Yellow,\" I groaned, with a shudder.\r\n" + 
				"\r\n" + 
				"\"He is a king whom emperors have served.\"\r\n" + 
				"\r\n" + 
				"\"I am content to serve him,\" I replied.\r\n" + 
				"\r\n" + 
				"Mr. Wilde sat rubbing his ears with his crippled hand. \"Perhaps Constance\r\n" + 
				"does not love him,\" he suggested.\r\n" + 
				"\r\n" + 
				"I started to reply, but a sudden burst of military music from the street\r\n" + 
				"below drowned my voice. The twentieth dragoon regiment, formerly in\r\n" + 
				"garrison at Mount St. Vincent, was returning from the manoeuvres in\r\n" + 
				"Westchester County, to its new barracks on East Washington Square. It was\r\n" + 
				"my cousin's regiment. They were a fine lot of fellows, in their pale\r\n" + 
				"blue, tight-fitting jackets, jaunty busbys and white riding breeches with\r\n" + 
				"the double yellow stripe, into which their limbs seemed moulded. Every\r\n" + 
				"other squadron was armed with lances, from the metal points of which\r\n" + 
				"fluttered yellow and white pennons. The band passed, playing the\r\n" + 
				"regimental march, then came the colonel and staff, the horses crowding\r\n" + 
				"and trampling, while their heads bobbed in unison, and the pennons\r\n" + 
				"fluttered from their lance points. The troopers, who rode with the\r\n" + 
				"beautiful English seat, looked brown as berries from their bloodless\r\n" + 
				"campaign among the farms of Westchester, and the music of their sabres\r\n" + 
				"against the stirrups, and the jingle of spurs and carbines was delightful\r\n" + 
				"to me. I saw Louis riding with his squadron. He was as handsome an\r\n" + 
				"officer as I have ever seen. Mr. Wilde, who had mounted a chair by the\r\n" + 
				"window, saw him too, but said nothing. Louis turned and looked straight\r\n" + 
				"at Hawberk's shop as he passed, and I could see the flush on his brown\r\n" + 
				"cheeks. I think Constance must have been at the window. When the last\r\n" + 
				"troopers had clattered by, and the last pennons vanished into South Fifth\r\n" + 
				"Avenue, Mr. Wilde clambered out of his chair and dragged the chest away\r\n" + 
				"from the door.\r\n" + 
				"\r\n" + 
				"\"Yes,\" he said, \"it is time that you saw your cousin Louis.\"\r\n" + 
				"\r\n" + 
				"He unlocked the door and I picked up my hat and stick and stepped into\r\n" + 
				"the corridor. The stairs were dark. Groping about, I set my foot on\r\n" + 
				"something soft, which snarled and spit, and I aimed a murderous blow at\r\n" + 
				"the cat, but my cane shivered to splinters against the balustrade, and\r\n" + 
				"the beast scurried back into Mr. Wilde's room.\r\n" + 
				"\r\n" + 
				"Passing Hawberk's door again I saw him still at work on the armour, but\r\n" + 
				"I did not stop, and stepping out into Bleecker Street, I followed it to\r\n" + 
				"Wooster, skirted the grounds of the Lethal Chamber, and crossing\r\n" + 
				"Washington Park went straight to my rooms in the Benedick. Here I lunched\r\n" + 
				"comfortably, read the _Herald_ and the _Meteor_, and finally went\r\n" + 
				"to the steel safe in my bedroom and set the time combination. The\r\n" + 
				"three and three-quarter minutes which it is necessary to wait, while the\r\n" + 
				"time lock is opening, are to me golden moments. From the instant I set\r\n" + 
				"the combination to the moment when I grasp the knobs and swing back\r\n" + 
				"the solid steel doors, I live in an ecstasy of expectation. Those moments\r\n" + 
				"must be like moments passed in Paradise. I know what I am to find at\r\n" + 
				"the end of the time limit. I know what the massive safe holds secure for\r\n" + 
				"me, for me alone, and the exquisite pleasure of waiting is hardly enhanced\r\n" + 
				"when the safe opens and I lift, from its velvet crown, a diadem of purest\r\n" + 
				"gold, blazing with diamonds. I do this every day, and yet the joy of\r\n" + 
				"waiting and at last touching again the diadem, only seems to increase as\r\n" + 
				"the days pass. It is a diadem fit for a King among kings, an Emperor\r\n" + 
				"among emperors. The King in Yellow might scorn it, but it shall be worn\r\n" + 
				"by his royal servant.\r\n" + 
				"\r\n" + 
				"I held it in my arms until the alarm in the safe rang harshly, and then\r\n" + 
				"tenderly, proudly, I replaced it and shut the steel doors. I walked\r\n" + 
				"slowly back into my study, which faces Washington Square, and leaned on\r\n" + 
				"the window sill. The afternoon sun poured into my windows, and a gentle\r\n" + 
				"breeze stirred the branches of the elms and maples in the park, now\r\n" + 
				"covered with buds and tender foliage. A flock of pigeons circled about\r\n" + 
				"the tower of the Memorial Church; sometimes alighting on the purple tiled\r\n" + 
				"roof, sometimes wheeling downward to the lotos fountain in front of the\r\n" + 
				"marble arch. The gardeners were busy with the flower beds around the\r\n" + 
				"fountain, and the freshly turned earth smelled sweet and spicy. A lawn\r\n" + 
				"mower, drawn by a fat white horse, clinked across the green sward, and\r\n" + 
				"watering-carts poured showers of spray over the asphalt drives. Around\r\n" + 
				"the statue of Peter Stuyvesant, which in 1897 had replaced the\r\n" + 
				"monstrosity supposed to represent Garibaldi, children played in the\r\n" + 
				"spring sunshine, and nurse girls wheeled elaborate baby carriages with a\r\n" + 
				"reckless disregard for the pasty-faced occupants, which could probably be\r\n" + 
				"explained by the presence of half a dozen trim dragoon troopers languidly\r\n" + 
				"lolling on the benches. Through the trees, the Washington Memorial Arch\r\n" + 
				"glistened like silver in the sunshine, and beyond, on the eastern\r\n" + 
				"extremity of the square the grey stone barracks of the dragoons, and the\r\n" + 
				"white granite artillery stables were alive with colour and motion.\r\n" + 
				"\r\n" + 
				"I looked at the Lethal Chamber on the corner of the square opposite. A\r\n" + 
				"few curious people still lingered about the gilded iron railing, but\r\n" + 
				"inside the grounds the paths were deserted. I watched the fountains\r\n" + 
				"ripple and sparkle; the sparrows had already found this new bathing nook,\r\n" + 
				"and the basins were covered with the dusty-feathered little things. Two\r\n" + 
				"or three white peacocks picked their way across the lawns, and a drab\r\n" + 
				"coloured pigeon sat so motionless on the arm of one of the \"Fates,\" that\r\n" + 
				"it seemed to be a part of the sculptured stone.\r\n" + 
				"\r\n" + 
				"As I was turning carelessly away, a slight commotion in the group of\r\n" + 
				"curious loiterers around the gates attracted my attention. A young man\r\n" + 
				"had entered, and was advancing with nervous strides along the gravel path\r\n" + 
				"which leads to the bronze doors of the Lethal Chamber. He paused a moment\r\n" + 
				"before the \"Fates,\" and as he raised his head to those three mysterious\r\n" + 
				"faces, the pigeon rose from its sculptured perch, circled about for a\r\n" + 
				"moment and wheeled to the east. The young man pressed his hand to his\r\n" + 
				"face, and then with an undefinable gesture sprang up the marble steps,\r\n" + 
				"the bronze doors closed behind him, and half an hour later the loiterers\r\n" + 
				"slouched away, and the frightened pigeon returned to its perch in the\r\n" + 
				"arms of Fate.\r\n" + 
				"\r\n" + 
				"I put on my hat and went out into the park for a little walk before\r\n" + 
				"dinner. As I crossed the central driveway a group of officers passed, and\r\n" + 
				"one of them called out, \"Hello, Hildred,\" and came back to shake hands\r\n" + 
				"with me. It was my cousin Louis, who stood smiling and tapping his\r\n" + 
				"spurred heels with his riding-whip.\r\n" + 
				"\r\n" + 
				"\"Just back from Westchester,\" he said; \"been doing the bucolic; milk and\r\n" + 
				"curds, you know, dairy-maids in sunbonnets, who say 'haeow' and 'I don't\r\n" + 
				"think' when you tell them they are pretty. I'm nearly dead for a square\r\n" + 
				"meal at Delmonico's. What's the news?\"\r\n" + 
				"\r\n" + 
				"\"There is none,\" I replied pleasantly. \"I saw your regiment coming in this\r\n" + 
				"morning.\"\r\n" + 
				"\r\n" + 
				"\"Did you? I didn't see you. Where were you?\"\r\n" + 
				"\r\n" + 
				"\"In Mr. Wilde's window.\"\r\n" + 
				"\r\n" + 
				"\"Oh, hell!\" he began impatiently, \"that man is stark mad! I don't\r\n" + 
				"understand why you--\"\r\n" + 
				"\r\n" + 
				"He saw how annoyed I felt by this outburst, and begged my pardon.\r\n" + 
				"\r\n" + 
				"\"Really, old chap,\" he said, \"I don't mean to run down a man you like,\r\n" + 
				"but for the life of me I can't see what the deuce you find in common with\r\n" + 
				"Mr. Wilde. He's not well bred, to put it generously; he is hideously\r\n" + 
				"deformed; his head is the head of a criminally insane person. You know\r\n" + 
				"yourself he's been in an asylum--\"\r\n" + 
				"\r\n" + 
				"\"So have I,\" I interrupted calmly.\r\n" + 
				"\r\n" + 
				"Louis looked startled and confused for a moment, but recovered and\r\n" + 
				"slapped me heartily on the shoulder. \"You were completely cured,\" he\r\n" + 
				"began; but I stopped him again.\r\n" + 
				"\r\n" + 
				"\"I suppose you mean that I was simply acknowledged never to have been\r\n" + 
				"insane.\"\r\n" + 
				"\r\n" + 
				"\"Of course that--that's what I meant,\" he laughed.\r\n" + 
				"\r\n" + 
				"I disliked his laugh because I knew it was forced, but I nodded gaily and\r\n" + 
				"asked him where he was going. Louis looked after his brother officers who\r\n" + 
				"had now almost reached Broadway.\r\n" + 
				"\r\n" + 
				"\"We had intended to sample a Brunswick cocktail, but to tell you the\r\n" + 
				"truth I was anxious for an excuse to go and see Hawberk instead. Come\r\n" + 
				"along, I'll make you my excuse.\"\r\n" + 
				"\r\n" + 
				"We found old Hawberk, neatly attired in a fresh spring suit, standing at\r\n" + 
				"the door of his shop and sniffing the air.\r\n" + 
				"\r\n" + 
				"\"I had just decided to take Constance for a little stroll before dinner,\"\r\n" + 
				"he replied to the impetuous volley of questions from Louis. \"We thought\r\n" + 
				"of walking on the park terrace along the North River.\"\r\n" + 
				"\r\n" + 
				"At that moment Constance appeared and grew pale and rosy by turns as\r\n" + 
				"Louis bent over her small gloved fingers. I tried to excuse myself,\r\n" + 
				"alleging an engagement uptown, but Louis and Constance would not listen,\r\n" + 
				"and I saw I was expected to remain and engage old Hawberk's attention.\r\n" + 
				"After all it would be just as well if I kept my eye on Louis, I thought,\r\n" + 
				"and when they hailed a Spring Street horse-car, I got in after them and\r\n" + 
				"took my seat beside the armourer.\r\n" + 
				"\r\n" + 
				"The beautiful line of parks and granite terraces overlooking the wharves\r\n" + 
				"along the North River, which were built in 1910 and finished in the\r\n" + 
				"autumn of 1917, had become one of the most popular promenades in the\r\n" + 
				"metropolis. They extended from the battery to 190th Street, overlooking\r\n" + 
				"the noble river and affording a fine view of the Jersey shore and the\r\n" + 
				"Highlands opposite. Cafes and restaurants were scattered here and there\r\n" + 
				"among the trees, and twice a week military bands from the garrison played\r\n" + 
				"in the kiosques on the parapets.\r\n" + 
				"\r\n" + 
				"We sat down in the sunshine on the bench at the foot of the equestrian\r\n" + 
				"statue of General Sheridan. Constance tipped her sunshade to shield her\r\n" + 
				"eyes, and she and Louis began a murmuring conversation which was\r\n" + 
				"impossible to catch. Old Hawberk, leaning on his ivory headed cane,\r\n" + 
				"lighted an excellent cigar, the mate to which I politely refused, and\r\n" + 
				"smiled at vacancy. The sun hung low above the Staten Island woods, and\r\n" + 
				"the bay was dyed with golden hues reflected from the sun-warmed sails of\r\n" + 
				"the shipping in the harbour.\r\n" + 
				"\r\n" + 
				"Brigs, schooners, yachts, clumsy ferry-boats, their decks swarming with\r\n" + 
				"people, railroad transports carrying lines of brown, blue and white\r\n" + 
				"freight cars, stately sound steamers, declasse tramp steamers, coasters,\r\n" + 
				"dredgers, scows, and everywhere pervading the entire bay impudent little\r\n" + 
				"tugs puffing and whistling officiously;--these were the craft which\r\n" + 
				"churned the sunlight waters as far as the eye could reach. In calm\r\n" + 
				"contrast to the hurry of sailing vessel and steamer a silent fleet of\r\n" + 
				"white warships lay motionless in midstream.\r\n" + 
				"\r\n" + 
				"Constance's merry laugh aroused me from my reverie.\r\n" + 
				"\r\n" + 
				"\"What _are_ you staring at?\" she inquired.\r\n" + 
				"\r\n" + 
				"\"Nothing--the fleet,\" I smiled.\r\n" + 
				"\r\n" + 
				"Then Louis told us what the vessels were, pointing out each by its\r\n" + 
				"relative position to the old Red Fort on Governor's Island.\r\n" + 
				"\r\n" + 
				"\"That little cigar shaped thing is a torpedo boat,\" he explained; \"there\r\n" + 
				"are four more lying close together. They are the _Tarpon_, the _Falcon_,\r\n" + 
				"the _Sea Fox_, and the _Octopus_. The gun-boats just above are the\r\n" + 
				"_Princeton_, the _Champlain_, the _Still Water_ and the _Erie_. Next to\r\n" + 
				"them lie the cruisers _Faragut_ and _Los Angeles_, and above them the\r\n" + 
				"battle ships _California_, and _Dakota_, and the _Washington_ which is\r\n" + 
				"the flag ship. Those two squatty looking chunks of metal which are\r\n" + 
				"anchored there off Castle William are the double turreted monitors\r\n" + 
				"_Terrible_ and _Magnificent_; behind them lies the ram, _Osceola_.\"\r\n" + 
				"\r\n" + 
				"Constance looked at him with deep approval in her beautiful eyes. \"What\r\n" + 
				"loads of things you know for a soldier,\" she said, and we all joined in\r\n" + 
				"the laugh which followed.\r\n" + 
				"\r\n" + 
				"Presently Louis rose with a nod to us and offered his arm to Constance,\r\n" + 
				"and they strolled away along the river wall. Hawberk watched them for a\r\n" + 
				"moment and then turned to me.\r\n" + 
				"\r\n" + 
				"\"Mr. Wilde was right,\" he said. \"I have found the missing tassets and\r\n" + 
				"left cuissard of the 'Prince's Emblazoned,' in a vile old junk garret in\r\n" + 
				"Pell Street.\"\r\n" + 
				"\r\n" + 
				"\"998?\" I inquired, with a smile.\r\n" + 
				"\r\n" + 
				"\"Yes.\"\r\n" + 
				"\r\n" + 
				"\"Mr. Wilde is a very intelligent man,\" I observed.\r\n" + 
				"\r\n" + 
				"\"I want to give him the credit of this most important discovery,\"\r\n" + 
				"continued Hawberk. \"And I intend it shall be known that he is entitled\r\n" + 
				"to the fame of it.\"\r\n" + 
				"\r\n" + 
				"\"He won't thank you for that,\" I answered sharply; \"please say nothing\r\n" + 
				"about it.\"\r\n" + 
				"\r\n" + 
				"\"Do you know what it is worth?\" said Hawberk.\r\n" + 
				"\r\n" + 
				"\"No, fifty dollars, perhaps.\"\r\n" + 
				"\r\n" + 
				"\"It is valued at five hundred, but the owner of the 'Prince's Emblazoned'\r\n" + 
				"will give two thousand dollars to the person who completes his suit; that\r\n" + 
				"reward also belongs to Mr. Wilde.\"\r\n" + 
				"\r\n" + 
				"\"He doesn't want it! He refuses it!\" I answered angrily. \"What do you\r\n" + 
				"know about Mr. Wilde? He doesn't need the money. He is rich--or will\r\n" + 
				"be--richer than any living man except myself. What will we care for money\r\n" + 
				"then--what will we care, he and I, when--when--\"\r\n" + 
				"\r\n" + 
				"\"When what?\" demanded Hawberk, astonished.\r\n" + 
				"\r\n" + 
				"\"You will see,\" I replied, on my guard again.\r\n" + 
				"\r\n" + 
				"He looked at me narrowly, much as Doctor Archer used to, and I knew he\r\n" + 
				"thought I was mentally unsound. Perhaps it was fortunate for him that he\r\n" + 
				"did not use the word lunatic just then.\r\n" + 
				"\r\n" + 
				"\"No,\" I replied to his unspoken thought, \"I am not mentally weak; my mind\r\n" + 
				"is as healthy as Mr. Wilde's. I do not care to explain just yet what I\r\n" + 
				"have on hand, but it is an investment which will pay more than mere gold,\r\n" + 
				"silver and precious stones. It will secure the happiness and prosperity\r\n" + 
				"of a continent--yes, a hemisphere!\"\r\n" + 
				"\r\n" + 
				"\"Oh,\" said Hawberk.\r\n" + 
				"\r\n" + 
				"\"And eventually,\" I continued more quietly, \"it will secure the happiness\r\n" + 
				"of the whole world.\"\r\n" + 
				"\r\n" + 
				"\"And incidentally your own happiness and prosperity as well as Mr.\r\n" + 
				"Wilde's?\"\r\n" + 
				"\r\n" + 
				"\"Exactly,\" I smiled. But I could have throttled him for taking that tone.\r\n" + 
				"\r\n" + 
				"He looked at me in silence for a while and then said very gently, \"Why\r\n" + 
				"don't you give up your books and studies, Mr. Castaigne, and take a tramp\r\n" + 
				"among the mountains somewhere or other? You used to be fond of fishing.\r\n" + 
				"Take a cast or two at the trout in the Rangelys.\"\r\n" + 
				"\r\n" + 
				"\"I don't care for fishing any more,\" I answered, without a shade of\r\n" + 
				"annoyance in my voice.\r\n" + 
				"\r\n" + 
				"\"You used to be fond of everything,\" he continued; \"athletics, yachting,\r\n" + 
				"shooting, riding--\"\r\n" + 
				"\r\n" + 
				"\"I have never cared to ride since my fall,\" I said quietly.\r\n" + 
				"\r\n" + 
				"\"Ah, yes, your fall,\" he repeated, looking away from me.\r\n" + 
				"\r\n" + 
				"I thought this nonsense had gone far enough, so I brought the\r\n" + 
				"conversation back to Mr. Wilde; but he was scanning my face again in a\r\n" + 
				"manner highly offensive to me.\r\n" + 
				"\r\n" + 
				"\"Mr. Wilde,\" he repeated, \"do you know what he did this afternoon? He\r\n" + 
				"came downstairs and nailed a sign over the hall door next to mine; it\r\n" + 
				"read:\r\n" + 
				"\r\n" + 
				"\"MR. WILDE,\r\n" + 
				"REPAIRER OF REPUTATIONS.\r\n" + 
				"Third Bell.\r\n" + 
				"\r\n" + 
				"\"Do you know what a Repairer of Reputations can be?\"\r\n" + 
				"\r\n" + 
				"\"I do,\" I replied, suppressing the rage within.\r\n" + 
				"\r\n" + 
				"\"Oh,\" he said again.\r\n" + 
				"\r\n" + 
				"Louis and Constance came strolling by and stopped to ask if we would join\r\n" + 
				"them. Hawberk looked at his watch. At the same moment a puff of smoke\r\n" + 
				"shot from the casemates of Castle William, and the boom of the sunset gun\r\n" + 
				"rolled across the water and was re-echoed from the Highlands opposite.\r\n" + 
				"The flag came running down from the flag-pole, the bugles sounded on the\r\n" + 
				"white decks of the warships, and the first electric light sparkled out\r\n" + 
				"from the Jersey shore.\r\n" + 
				"\r\n" + 
				"As I turned into the city with Hawberk I heard Constance murmur something\r\n" + 
				"to Louis which I did not understand; but Louis whispered \"My darling,\" in\r\n" + 
				"reply; and again, walking ahead with Hawberk through the square I heard a\r\n" + 
				"murmur of \"sweetheart,\" and \"my own Constance,\" and I knew the time had\r\n" + 
				"nearly arrived when I should speak of important matters with my cousin\r\n" + 
				"Louis.\r\n" + 
				"\r\n" + 
				"III\r\n" + 
				"\r\n" + 
				"One morning early in May I stood before the steel safe in my bedroom,\r\n" + 
				"trying on the golden jewelled crown. The diamonds flashed fire as I\r\n" + 
				"turned to the mirror, and the heavy beaten gold burned like a halo about\r\n" + 
				"my head. I remembered Camilla's agonized scream and the awful words\r\n" + 
				"echoing through the dim streets of Carcosa. They were the last lines in\r\n" + 
				"the first act, and I dared not think of what followed--dared not, even\r\n" + 
				"in the spring sunshine, there in my own room, surrounded with familiar\r\n" + 
				"objects, reassured by the bustle from the street and the voices of the\r\n" + 
				"servants in the hallway outside. For those poisoned words had dropped\r\n" + 
				"slowly into my heart, as death-sweat drops upon a bed-sheet and is\r\n" + 
				"absorbed. Trembling, I put the diadem from my head and wiped my forehead,\r\n" + 
				"but I thought of Hastur and of my own rightful ambition, and I remembered\r\n" + 
				"Mr. Wilde as I had last left him, his face all torn and bloody from the\r\n" + 
				"claws of that devil's creature, and what he said--ah, what he said. The\r\n" + 
				"alarm bell in the safe began to whirr harshly, and I knew my time was up;\r\n" + 
				"but I would not heed it, and replacing the flashing circlet upon my head\r\n" + 
				"I turned defiantly to the mirror. I stood for a long time absorbed in the\r\n" + 
				"changing expression of my own eyes. The mirror reflected a face which was\r\n" + 
				"like my own, but whiter, and so thin that I hardly recognized it And all\r\n" + 
				"the time I kept repeating between my clenched teeth, \"The day has come!\r\n" + 
				"the day has come!\" while the alarm in the safe whirred and clamoured, and\r\n" + 
				"the diamonds sparkled and flamed above my brow. I heard a door open but\r\n" + 
				"did not heed it. It was only when I saw two faces in the mirror:--it was\r\n" + 
				"only when another face rose over my shoulder, and two other eyes met\r\n" + 
				"mine. I wheeled like a flash and seized a long knife from my\r\n" + 
				"dressing-table, and my cousin sprang back very pale, crying: \"Hildred!\r\n" + 
				"for God's sake!\" then as my hand fell, he said: \"It is I, Louis, don't\r\n" + 
				"you know me?\" I stood silent. I could not have spoken for my life. He\r\n" + 
				"walked up to me and took the knife from my hand.\r\n" + 
				"\r\n" + 
				"\"What is all this?\" he inquired, in a gentle voice. \"Are you ill?\"\r\n" + 
				"\r\n" + 
				"\"No,\" I replied. But I doubt if he heard me.\r\n" + 
				"\r\n" + 
				"\"Come, come, old fellow,\" he cried, \"take off that brass crown and toddle\r\n" + 
				"into the study. Are you going to a masquerade? What's all this theatrical\r\n" + 
				"tinsel anyway?\"\r\n" + 
				"\r\n" + 
				"I was glad he thought the crown was made of brass and paste, yet I didn't\r\n" + 
				"like him any the better for thinking so. I let him take it from my hand,\r\n" + 
				"knowing it was best to humour him. He tossed the splendid diadem in the\r\n" + 
				"air, and catching it, turned to me smiling.\r\n" + 
				"\r\n" + 
				"\"It's dear at fifty cents,\" he said. \"What's it for?\"\r\n" + 
				"\r\n" + 
				"I did not answer, but took the circlet from his hands, and placing it in\r\n" + 
				"the safe shut the massive steel door. The alarm ceased its infernal din\r\n" + 
				"at once. He watched me curiously, but did not seem to notice the sudden\r\n" + 
				"ceasing of the alarm. He did, however, speak of the safe as a biscuit\r\n" + 
				"box. Fearing lest he might examine the combination I led the way into my\r\n" + 
				"study. Louis threw himself on the sofa and flicked at flies with his\r\n" + 
				"eternal riding-whip. He wore his fatigue uniform with the braided jacket\r\n" + 
				"and jaunty cap, and I noticed that his riding-boots were all splashed\r\n" + 
				"with red mud.\r\n" + 
				"\r\n" + 
				"\"Where have you been?\" I inquired.\r\n" + 
				"\r\n" + 
				"\"Jumping mud creeks in Jersey,\" he said. \"I haven't had time to change\r\n" + 
				"yet; I was rather in a hurry to see you. Haven't you got a glass of\r\n" + 
				"something? I'm dead tired; been in the saddle twenty-four hours.\"\r\n" + 
				"\r\n" + 
				"I gave him some brandy from my medicinal store, which he drank with a\r\n" + 
				"grimace.\r\n" + 
				"\r\n" + 
				"\"Damned bad stuff,\" he observed. \"I'll give you an address where they\r\n" + 
				"sell brandy that is brandy.\"\r\n" + 
				"\r\n" + 
				"\"It's good enough for my needs,\" I said indifferently. \"I use it to rub\r\n" + 
				"my chest with.\" He stared and flicked at another fly.\r\n" + 
				"\r\n" + 
				"\"See here, old fellow,\" he began, \"I've got something to suggest to you.\r\n" + 
				"It's four years now that you've shut yourself up here like an owl, never\r\n" + 
				"going anywhere, never taking any healthy exercise, never doing a damn\r\n" + 
				"thing but poring over those books up there on the mantelpiece.\"\r\n" + 
				"\r\n" + 
				"He glanced along the row of shelves. \"Napoleon, Napoleon, Napoleon!\" he\r\n" + 
				"read. \"For heaven's sake, have you nothing but Napoleons there?\"\r\n" + 
				"\r\n" + 
				"\"I wish they were bound in gold,\" I said. \"But wait, yes, there is\r\n" + 
				"another book, _The King in Yellow_.\" I looked him steadily in the\r\n" + 
				"eye.\r\n" + 
				"\r\n" + 
				"\"Have you never read it?\" I asked.\r\n" + 
				"\r\n" + 
				"\"I? No, thank God! I don't want to be driven crazy.\"\r\n" + 
				"\r\n" + 
				"I saw he regretted his speech as soon as he had uttered it. There is only\r\n" + 
				"one word which I loathe more than I do lunatic and that word is crazy.\r\n" + 
				"But I controlled myself and asked him why he thought _The King in\r\n" + 
				"Yellow_ dangerous.\r\n" + 
				"\r\n" + 
				"\"Oh, I don't know,\" he said, hastily. \"I only remember the excitement it\r\n" + 
				"created and the denunciations from pulpit and Press. I believe the author\r\n" + 
				"shot himself after bringing forth this monstrosity, didn't he?\"\r\n" + 
				"\r\n" + 
				"\"I understand he is still alive,\" I answered.\r\n" + 
				"\r\n" + 
				"\"That's probably true,\" he muttered; \"bullets couldn't kill a fiend like\r\n" + 
				"that.\"\r\n" + 
				"\r\n" + 
				"\"It is a book of great truths,\" I said.\r\n" + 
				"\r\n" + 
				"\"Yes,\" he replied, \"of 'truths' which send men frantic and blast their\r\n" + 
				"lives. I don't care if the thing is, as they say, the very supreme\r\n" + 
				"essence of art. It's a crime to have written it, and I for one shall\r\n" + 
				"never open its pages.\"\r\n" + 
				"\r\n" + 
				"\"Is that what you have come to tell me?\" I asked.\r\n" + 
				"\r\n" + 
				"\"No,\" he said, \"I came to tell you that I am going to be married.\"\r\n" + 
				"\r\n" + 
				"I believe for a moment my heart ceased to beat, but I kept my eyes on his\r\n" + 
				"face.\r\n" + 
				"\r\n" + 
				"\"Yes,\" he continued, smiling happily, \"married to the sweetest girl on\r\n" + 
				"earth.\"\r\n" + 
				"\r\n" + 
				"\"Constance Hawberk,\" I said mechanically.\r\n" + 
				"\r\n" + 
				"\"How did you know?\" he cried, astonished. \"I didn't know it myself until\r\n" + 
				"that evening last April, when we strolled down to the embankment before\r\n" + 
				"dinner.\"\r\n" + 
				"\r\n" + 
				"\"When is it to be?\" I asked.\r\n" + 
				"\r\n" + 
				"\"It was to have been next September, but an hour ago a despatch came\r\n" + 
				"ordering our regiment to the Presidio, San Francisco. We leave at noon\r\n" + 
				"to-morrow. To-morrow,\" he repeated. \"Just think, Hildred, to-morrow I\r\n" + 
				"shall be the happiest fellow that ever drew breath in this jolly world,\r\n" + 
				"for Constance will go with me.\"\r\n" + 
				"\r\n" + 
				"I offered him my hand in congratulation, and he seized and shook it like\r\n" + 
				"the good-natured fool he was--or pretended to be.\r\n" + 
				"\r\n" + 
				"\"I am going to get my squadron as a wedding present,\" he rattled on.\r\n" + 
				"\"Captain and Mrs. Louis Castaigne, eh, Hildred?\"\r\n" + 
				"\r\n" + 
				"Then he told me where it was to be and who were to be there, and made me\r\n" + 
				"promise to come and be best man. I set my teeth and listened to his\r\n" + 
				"boyish chatter without showing what I felt, but--\r\n" + 
				"\r\n" + 
				"I was getting to the limit of my endurance, and when he jumped up, and,\r\n" + 
				"switching his spurs till they jingled, said he must go, I did not detain\r\n" + 
				"him.\r\n" + 
				"\r\n" + 
				"\"There's one thing I want to ask of you,\" I said quietly.\r\n" + 
				"\r\n" + 
				"\"Out with it, it's promised,\" he laughed.\r\n" + 
				"\r\n" + 
				"\"I want you to meet me for a quarter of an hour's talk to-night.\"\r\n" + 
				"\r\n" + 
				"\"Of course, if you wish,\" he said, somewhat puzzled. \"Where?\"\r\n" + 
				"\r\n" + 
				"\"Anywhere, in the park there.\"\r\n" + 
				"\r\n" + 
				"\"What time, Hildred?\"\r\n" + 
				"\r\n" + 
				"\"Midnight.\"\r\n" + 
				"\r\n" + 
				"\"What in the name of--\" he began, but checked himself and laughingly\r\n" + 
				"assented. I watched him go down the stairs and hurry away, his sabre\r\n" + 
				"banging at every stride. He turned into Bleecker Street, and I knew he\r\n" + 
				"was going to see Constance. I gave him ten minutes to disappear and then\r\n" + 
				"followed in his footsteps, taking with me the jewelled crown and the\r\n" + 
				"silken robe embroidered with the Yellow Sign. When I turned into Bleecker\r\n" + 
				"Street, and entered the doorway which bore the sign--\r\n" + 
				"\r\n" + 
				"MR. WILDE,\r\n" + 
				"REPAIRER OF REPUTATIONS.\r\n" + 
				"Third Bell.\r\n" + 
				"\r\n" + 
				"I saw old Hawberk moving about in his shop, and imagined I heard\r\n" + 
				"Constance's voice in the parlour; but I avoided them both and hurried up\r\n" + 
				"the trembling stairways to Mr. Wilde's apartment. I knocked and entered\r\n" + 
				"without ceremony. Mr. Wilde lay groaning on the floor, his face covered\r\n" + 
				"with blood, his clothes torn to shreds. Drops of blood were scattered\r\n" + 
				"about over the carpet, which had also been ripped and frayed in the\r\n" + 
				"evidently recent struggle.\r\n" + 
				"\r\n" + 
				"\"It's that cursed cat,\" he said, ceasing his groans, and turning his\r\n" + 
				"colourless eyes to me; \"she attacked me while I was asleep. I believe she\r\n" + 
				"will kill me yet.\"\r\n" + 
				"\r\n" + 
				"This was too much, so I went into the kitchen, and, seizing a hatchet\r\n" + 
				"from the pantry, started to find the infernal beast and settle her then\r\n" + 
				"and there. My search was fruitless, and after a while I gave it up and\r\n" + 
				"came back to find Mr. Wilde squatting on his high chair by the table. He\r\n" + 
				"had washed his face and changed his clothes. The great furrows which the\r\n" + 
				"cat's claws had ploughed up in his face he had filled with collodion, and\r\n" + 
				"a rag hid the wound in his throat. I told him I should kill the cat when\r\n" + 
				"I came across her, but he only shook his head and turned to the open\r\n" + 
				"ledger before him. He read name after name of the people who had come to\r\n" + 
				"him in regard to their reputation, and the sums he had amassed were\r\n" + 
				"startling.\r\n" + 
				"\r\n" + 
				"\"I put on the screws now and then,\" he explained.\r\n" + 
				"\r\n" + 
				"\"One day or other some of these people will assassinate you,\" I insisted.\r\n" + 
				"\r\n" + 
				"\"Do you think so?\" he said, rubbing his mutilated ears.\r\n" + 
				"\r\n" + 
				"It was useless to argue with him, so I took down the manuscript entitled\r\n" + 
				"Imperial Dynasty of America, for the last time I should ever take it down\r\n" + 
				"in Mr. Wilde's study. I read it through, thrilling and trembling with\r\n" + 
				"pleasure. When I had finished Mr. Wilde took the manuscript and, turning\r\n" + 
				"to the dark passage which leads from his study to his bed-chamber,\r\n" + 
				"called out in a loud voice, \"Vance.\" Then for the first time, I noticed a\r\n" + 
				"man crouching there in the shadow. How I had overlooked him during my\r\n" + 
				"search for the cat, I cannot imagine.\r\n" + 
				"\r\n" + 
				"\"Vance, come in,\" cried Mr. Wilde.\r\n" + 
				"\r\n" + 
				"The figure rose and crept towards us, and I shall never forget the face\r\n" + 
				"that he raised to mine, as the light from the window illuminated it.\r\n" + 
				"\r\n" + 
				"\"Vance, this is Mr. Castaigne,\" said Mr. Wilde. Before he had finished\r\n" + 
				"speaking, the man threw himself on the ground before the table, crying\r\n" + 
				"and grasping, \"Oh, God! Oh, my God! Help me! Forgive me! Oh, Mr.\r\n" + 
				"Castaigne, keep that man away. You cannot, you cannot mean it! You are\r\n" + 
				"different--save me! I am broken down--I was in a madhouse and now--when\r\n" + 
				"all was coming right--when I had forgotten the King--the King in Yellow\r\n" + 
				"and--but I shall go mad again--I shall go mad--\"\r\n" + 
				"\r\n" + 
				"His voice died into a choking rattle, for Mr. Wilde had leapt on him and\r\n" + 
				"his right hand encircled the man's throat. When Vance fell in a heap on\r\n" + 
				"the floor, Mr. Wilde clambered nimbly into his chair again, and rubbing\r\n" + 
				"his mangled ears with the stump of his hand, turned to me and asked me\r\n" + 
				"for the ledger. I reached it down from the shelf and he opened it. After\r\n" + 
				"a moment's searching among the beautifully written pages, he coughed\r\n" + 
				"complacently, and pointed to the name Vance.\r\n" + 
				"\r\n" + 
				"\"Vance,\" he read aloud, \"Osgood Oswald Vance.\" At the sound of his name,\r\n" + 
				"the man on the floor raised his head and turned a convulsed face to Mr.\r\n" + 
				"Wilde. His eyes were injected with blood, his lips tumefied. \"Called\r\n" + 
				"April 28th,\" continued Mr. Wilde. \"Occupation, cashier in the Seaforth\r\n" + 
				"National Bank; has served a term of forgery at Sing Sing, from whence he\r\n" + 
				"was transferred to the Asylum for the Criminal Insane. Pardoned by the\r\n" + 
				"Governor of New York, and discharged from the Asylum, January 19, 1918.\r\n" + 
				"Reputation damaged at Sheepshead Bay. Rumours that he lives beyond his\r\n" + 
				"income. Reputation to be repaired at once. Retainer $1,500.\r\n" + 
				"\r\n" + 
				"\"Note.--Has embezzled sums amounting to $30,000 since March 20, 1919,\r\n" + 
				"excellent family, and secured present position through uncle's influence.\r\n" + 
				"Father, President of Seaforth Bank.\"\r\n" + 
				"\r\n" + 
				"I looked at the man on the floor.\r\n" + 
				"\r\n" + 
				"\"Get up, Vance,\" said Mr. Wilde in a gentle voice. Vance rose as if\r\n" + 
				"hypnotized. \"He will do as we suggest now,\" observed Mr. Wilde, and\r\n" + 
				"opening the manuscript, he read the entire history of the Imperial\r\n" + 
				"Dynasty of America. Then in a kind and soothing murmur he ran over the\r\n" + 
				"important points with Vance, who stood like one stunned. His eyes were so\r\n" + 
				"blank and vacant that I imagined he had become half-witted, and remarked\r\n" + 
				"it to Mr. Wilde who replied that it was of no consequence anyway. Very\r\n" + 
				"patiently we pointed out to Vance what his share in the affair would be,\r\n" + 
				"and he seemed to understand after a while. Mr. Wilde explained the\r\n" + 
				"manuscript, using several volumes on Heraldry, to substantiate the result\r\n" + 
				"of his researches. He mentioned the establishment of the Dynasty in\r\n" + 
				"Carcosa, the lakes which connected Hastur, Aldebaran and the mystery of\r\n" + 
				"the Hyades. He spoke of Cassilda and Camilla, and sounded the cloudy\r\n" + 
				"depths of Demhe, and the Lake of Hali. \"The scolloped tatters of the King\r\n" + 
				"in Yellow must hide Yhtill forever,\" he muttered, but I do not believe\r\n" + 
				"Vance heard him. Then by degrees he led Vance along the ramifications of\r\n" + 
				"the Imperial family, to Uoht and Thale, from Naotalba and Phantom of\r\n" + 
				"Truth, to Aldones, and then tossing aside his manuscript and notes, he\r\n" + 
				"began the wonderful story of the Last King. Fascinated and thrilled I\r\n" + 
				"watched him. He threw up his head, his long arms were stretched out in a\r\n" + 
				"magnificent gesture of pride and power, and his eyes blazed deep in their\r\n" + 
				"sockets like two emeralds. Vance listened stupefied. As for me, when at\r\n" + 
				"last Mr. Wilde had finished, and pointing to me, cried, \"The cousin of\r\n" + 
				"the King!\" my head swam with excitement.\r\n" + 
				"\r\n" + 
				"Controlling myself with a superhuman effort, I explained to Vance why I\r\n" + 
				"alone was worthy of the crown and why my cousin must be exiled or die.\r\n" + 
				"I made him understand that my cousin must never marry, even after\r\n" + 
				"renouncing all his claims, and how that least of all he should marry the\r\n" + 
				"daughter of the Marquis of Avonshire and bring England into the question.\r\n" + 
				"I showed him a list of thousands of names which Mr. Wilde had drawn up;\r\n" + 
				"every man whose name was there had received the Yellow Sign which no\r\n" + 
				"living human being dared disregard. The city, the state, the whole land,\r\n" + 
				"were ready to rise and tremble before the Pallid Mask.\r\n" + 
				"\r\n" + 
				"The time had come, the people should know the son of Hastur, and the\r\n" + 
				"whole world bow to the black stars which hang in the sky over Carcosa.\r\n" + 
				"\r\n" + 
				"Vance leaned on the table, his head buried in his hands. Mr. Wilde drew\r\n" + 
				"a rough sketch on the margin of yesterday's _Herald_ with a bit of\r\n" + 
				"lead pencil. It was a plan of Hawberk's rooms. Then he wrote out the\r\n" + 
				"order and affixed the seal, and shaking like a palsied man I signed my\r\n" + 
				"first writ of execution with my name Hildred-Rex.\r\n" + 
				"\r\n" + 
				"Mr. Wilde clambered to the floor and unlocking the cabinet, took a long\r\n" + 
				"square box from the first shelf. This he brought to the table and opened.\r\n" + 
				"A new knife lay in the tissue paper inside and I picked it up and handed\r\n" + 
				"it to Vance, along with the order and the plan of Hawberk's apartment.\r\n" + 
				"Then Mr. Wilde told Vance he could go; and he went, shambling like an\r\n" + 
				"outcast of the slums.\r\n" + 
				"\r\n" + 
				"I sat for a while watching the daylight fade behind the square tower of\r\n" + 
				"the Judson Memorial Church, and finally, gathering up the manuscript and\r\n" + 
				"notes, took my hat and started for the door.\r\n" + 
				"\r\n" + 
				"Mr. Wilde watched me in silence. When I had stepped into the hall I\r\n" + 
				"looked back. Mr. Wilde's small eyes were still fixed on me. Behind him,\r\n" + 
				"the shadows gathered in the fading light. Then I closed the door behind\r\n" + 
				"me and went out into the darkening streets.\r\n" + 
				"\r\n" + 
				"I had eaten nothing since breakfast, but I was not hungry. A wretched,\r\n" + 
				"half-starved creature, who stood looking across the street at the Lethal\r\n" + 
				"Chamber, noticed me and came up to tell me a tale of misery. I gave him\r\n" + 
				"money, I don't know why, and he went away without thanking me. An\r\n" + 
				"hour later another outcast approached and whined his story. I had a blank\r\n" + 
				"bit of paper in my pocket, on which was traced the Yellow Sign, and I\r\n" + 
				"handed it to him. He looked at it stupidly for a moment, and then with an\r\n" + 
				"uncertain glance at me, folded it with what seemed to me exaggerated care\r\n" + 
				"and placed it in his bosom.\r\n" + 
				"\r\n" + 
				"The electric lights were sparkling among the trees, and the new moon\r\n" + 
				"shone in the sky above the Lethal Chamber. It was tiresome waiting in the\r\n" + 
				"square; I wandered from the Marble Arch to the artillery stables and back\r\n" + 
				"again to the lotos fountain. The flowers and grass exhaled a fragrance\r\n" + 
				"which troubled me. The jet of the fountain played in the moonlight, and\r\n" + 
				"the musical splash of falling drops reminded me of the tinkle of chained\r\n" + 
				"mail in Hawberk's shop. But it was not so fascinating, and the dull\r\n" + 
				"sparkle of the moonlight on the water brought no such sensations of\r\n" + 
				"exquisite pleasure, as when the sunshine played over the polished steel\r\n" + 
				"of a corselet on Hawberk's knee. I watched the bats darting and turning\r\n" + 
				"above the water plants in the fountain basin, but their rapid, jerky\r\n" + 
				"flight set my nerves on edge, and I went away again to walk aimlessly to\r\n" + 
				"and fro among the trees.\r\n" + 
				"\r\n" + 
				"The artillery stables were dark, but in the cavalry barracks the\r\n" + 
				"officers' windows were brilliantly lighted, and the sallyport was\r\n" + 
				"constantly filled with troopers in fatigue, carrying straw and harness\r\n" + 
				"and baskets filled with tin dishes.\r\n" + 
				"\r\n" + 
				"Twice the mounted sentry at the gates was changed while I wandered up and\r\n" + 
				"down the asphalt walk. I looked at my watch. It was nearly time. The\r\n" + 
				"lights in the barracks went out one by one, the barred gate was closed,\r\n" + 
				"and every minute or two an officer passed in through the side wicket,\r\n" + 
				"leaving a rattle of accoutrements and a jingle of spurs on the night air.\r\n" + 
				"The square had become very silent. The last homeless loiterer had been\r\n" + 
				"driven away by the grey-coated park policeman, the car tracks along\r\n" + 
				"Wooster Street were deserted, and the only sound which broke the\r\n" + 
				"stillness was the stamping of the sentry's horse and the ring of his\r\n" + 
				"sabre against the saddle pommel. In the barracks, the officers' quarters\r\n" + 
				"were still lighted, and military servants passed and repassed before the\r\n" + 
				"bay windows. Twelve o'clock sounded from the new spire of St. Francis\r\n" + 
				"Xavier, and at the last stroke of the sad-toned bell a figure passed\r\n" + 
				"through the wicket beside the portcullis, returned the salute of the\r\n" + 
				"sentry, and crossing the street entered the square and advanced toward\r\n" + 
				"the Benedick apartment house.\r\n" + 
				"\r\n" + 
				"\"Louis,\" I called.\r\n" + 
				"\r\n" + 
				"The man pivoted on his spurred heels and came straight toward me.\r\n" + 
				"\r\n" + 
				"\"Is that you, Hildred?\"\r\n" + 
				"\r\n" + 
				"\"Yes, you are on time.\"\r\n" + 
				"\r\n" + 
				"I took his offered hand, and we strolled toward the Lethal Chamber.\r\n" + 
				"\r\n" + 
				"He rattled on about his wedding and the graces of Constance, and their\r\n" + 
				"future prospects, calling my attention to his captain's shoulder-straps,\r\n" + 
				"and the triple gold arabesque on his sleeve and fatigue cap. I believe I\r\n" + 
				"listened as much to the music of his spurs and sabre as I did to his\r\n" + 
				"boyish babble, and at last we stood under the elms on the Fourth Street\r\n" + 
				"corner of the square opposite the Lethal Chamber. Then he laughed and\r\n" + 
				"asked me what I wanted with him. I motioned him to a seat on a bench\r\n" + 
				"under the electric light, and sat down beside him. He looked at me\r\n" + 
				"curiously, with that same searching glance which I hate and fear so in\r\n" + 
				"doctors. I felt the insult of his look, but he did not know it, and I\r\n" + 
				"carefully concealed my feelings.\r\n" + 
				"\r\n" + 
				"\"Well, old chap,\" he inquired, \"what can I do for you?\"\r\n" + 
				"\r\n" + 
				"I drew from my pocket the manuscript and notes of the Imperial Dynasty\r\n" + 
				"of America, and looking him in the eye said:\r\n" + 
				"\r\n" + 
				"\"I will tell you. On your word as a soldier, promise me to read this\r\n" + 
				"manuscript from beginning to end, without asking me a question. Promise\r\n" + 
				"me to read these notes in the same way, and promise me to listen to what\r\n" + 
				"I have to tell later.\"\r\n" + 
				"\r\n" + 
				"\"I promise, if you wish it,\" he said pleasantly. \"Give me the paper,\r\n" + 
				"Hildred.\"\r\n" + 
				"\r\n" + 
				"He began to read, raising his eyebrows with a puzzled, whimsical air,\r\n" + 
				"which made me tremble with suppressed anger. As he advanced his, eyebrows\r\n" + 
				"contracted, and his lips seemed to form the word \"rubbish.\"\r\n" + 
				"\r\n" + 
				"Then he looked slightly bored, but apparently for my sake read, with an\r\n" + 
				"attempt at interest, which presently ceased to be an effort He started\r\n" + 
				"when in the closely written pages he came to his own name, and when he\r\n" + 
				"came to mine he lowered the paper, and looked sharply at me for a moment\r\n" + 
				"But he kept his word, and resumed his reading, and I let the half-formed\r\n" + 
				"question die on his lips unanswered. When he came to the end and read the\r\n" + 
				"signature of Mr. Wilde, he folded the paper carefully and returned it to\r\n" + 
				"me. I handed him the notes, and he settled back, pushing his fatigue cap\r\n" + 
				"up to his forehead, with a boyish gesture, which I remembered so well in\r\n" + 
				"school. I watched his face as he read, and when he finished I took the\r\n" + 
				"notes with the manuscript, and placed them in my pocket. Then I unfolded\r\n" + 
				"a scroll marked with the Yellow Sign. He saw the sign, but he did not\r\n" + 
				"seem to recognize it, and I called his attention to it somewhat sharply.\r\n" + 
				"\r\n" + 
				"\"Well,\" he said, \"I see it. What is it?\"\r\n" + 
				"\r\n" + 
				"\"It is the Yellow Sign,\" I said angrily.\r\n" + 
				"\r\n" + 
				"\"Oh, that's it, is it?\" said Louis, in that flattering voice, which\r\n" + 
				"Doctor Archer used to employ with me, and would probably have employed\r\n" + 
				"again, had I not settled his affair for him.\r\n" + 
				"\r\n" + 
				"I kept my rage down and answered as steadily as possible, \"Listen, you\r\n" + 
				"have engaged your word?\"\r\n" + 
				"\r\n" + 
				"\"I am listening, old chap,\" he replied soothingly.\r\n" + 
				"\r\n" + 
				"I began to speak very calmly.\r\n" + 
				"\r\n" + 
				"\"Dr. Archer, having by some means become possessed of the secret of the\r\n" + 
				"Imperial Succession, attempted to deprive me of my right, alleging that\r\n" + 
				"because of a fall from my horse four years ago, I had become mentally\r\n" + 
				"deficient. He presumed to place me under restraint in his own house in\r\n" + 
				"hopes of either driving me insane or poisoning me. I have not forgotten\r\n" + 
				"it. I visited him last night and the interview was final.\"\r\n" + 
				"\r\n" + 
				"Louis turned quite pale, but did not move. I resumed triumphantly, \"There\r\n" + 
				"are yet three people to be interviewed in the interests of Mr. Wilde and\r\n" + 
				"myself. They are my cousin Louis, Mr. Hawberk, and his daughter\r\n" + 
				"Constance.\"\r\n" + 
				"\r\n" + 
				"Louis sprang to his feet and I arose also, and flung the paper marked\r\n" + 
				"with the Yellow Sign to the ground.\r\n" + 
				"\r\n" + 
				"\"Oh, I don't need that to tell you what I have to say,\" I cried, with a\r\n" + 
				"laugh of triumph. \"You must renounce the crown to me, do you hear, to\r\n" + 
				"_me_.\"\r\n" + 
				"\r\n" + 
				"Louis looked at me with a startled air, but recovering himself said\r\n" + 
				"kindly, \"Of course I renounce the--what is it I must renounce?\"\r\n" + 
				"\r\n" + 
				"\"The crown,\" I said angrily.\r\n" + 
				"\r\n" + 
				"\"Of course,\" he answered, \"I renounce it. Come, old chap, I'll walk back\r\n" + 
				"to your rooms with you.\"\r\n" + 
				"\r\n" + 
				"\"Don't try any of your doctor's tricks on me,\" I cried, trembling with\r\n" + 
				"fury. \"Don't act as if you think I am insane.\"\r\n" + 
				"\r\n" + 
				"\"What nonsense,\" he replied. \"Come, it's getting late, Hildred.\"\r\n" + 
				"\r\n" + 
				"\"No,\" I shouted, \"you must listen. You cannot marry, I forbid it. Do you\r\n" + 
				"hear? I forbid it. You shall renounce the crown, and in reward I grant\r\n" + 
				"you exile, but if you refuse you shall die.\"\r\n" + 
				"\r\n" + 
				"He tried to calm me, but I was roused at last, and drawing my long knife\r\n" + 
				"barred his way.\r\n" + 
				"\r\n" + 
				"Then I told him how they would find Dr. Archer in the cellar with his\r\n" + 
				"throat open, and I laughed in his face when I thought of Vance and his\r\n" + 
				"knife, and the order signed by me.\r\n" + 
				"\r\n" + 
				"\"Ah, you are the King,\" I cried, \"but I shall be King. Who are you to\r\n" + 
				"keep me from Empire over all the habitable earth! I was born the cousin\r\n" + 
				"of a king, but I shall be King!\"\r\n" + 
				"\r\n" + 
				"Louis stood white and rigid before me. Suddenly a man came running up\r\n" + 
				"Fourth Street, entered the gate of the Lethal Temple, traversed the path\r\n" + 
				"to the bronze doors at full speed, and plunged into the death chamber\r\n" + 
				"with the cry of one demented, and I laughed until I wept tears, for I had\r\n" + 
				"recognized Vance, and knew that Hawberk and his daughter were no longer\r\n" + 
				"in my way.\r\n" + 
				"\r\n" + 
				"\"Go,\" I cried to Louis, \"you have ceased to be a menace. You will never\r\n" + 
				"marry Constance now, and if you marry any one else in your exile, I will\r\n" + 
				"visit you as I did my doctor last night. Mr. Wilde takes charge of you\r\n" + 
				"to-morrow.\" Then I turned and darted into South Fifth Avenue, and with a\r\n" + 
				"cry of terror Louis dropped his belt and sabre and followed me like the\r\n" + 
				"wind. I heard him close behind me at the corner of Bleecker Street, and I\r\n" + 
				"dashed into the doorway under Hawberk's sign. He cried, \"Halt, or I\r\n" + 
				"fire!\" but when he saw that I flew up the stairs leaving Hawberk's shop\r\n" + 
				"below, he left me, and I heard him hammering and shouting at their door\r\n" + 
				"as though it were possible to arouse the dead.\r\n" + 
				"\r\n" + 
				"Mr. Wilde's door was open, and I entered crying, \"It is done, it is done!\r\n" + 
				"Let the nations rise and look upon their King!\" but I could not find Mr.\r\n" + 
				"Wilde, so I went to the cabinet and took the splendid diadem from its\r\n" + 
				"case. Then I drew on the white silk robe, embroidered with the Yellow\r\n" + 
				"Sign, and placed the crown upon my head. At last I was King, King by my\r\n" + 
				"right in Hastur, King because I knew the mystery of the Hyades, and my\r\n" + 
				"mind had sounded the depths of the Lake of Hali. I was King! The first\r\n" + 
				"grey pencillings of dawn would raise a tempest which would shake two\r\n" + 
				"hemispheres. Then as I stood, my every nerve pitched to the highest\r\n" + 
				"tension, faint with the joy and splendour of my thought, without, in the\r\n" + 
				"dark passage, a man groaned.\r\n" + 
				"\r\n" + 
				"I seized the tallow dip and sprang to the door. The cat passed me like a\r\n" + 
				"demon, and the tallow dip went out, but my long knife flew swifter than\r\n" + 
				"she, and I heard her screech, and I knew that my knife had found her. For\r\n" + 
				"a moment I listened to her tumbling and thumping about in the darkness,\r\n" + 
				"and then when her frenzy ceased, I lighted a lamp and raised it over my\r\n" + 
				"head. Mr. Wilde lay on the floor with his throat torn open. At first I\r\n" + 
				"thought he was dead, but as I looked, a green sparkle came into his\r\n" + 
				"sunken eyes, his mutilated hand trembled, and then a spasm stretched his\r\n" + 
				"mouth from ear to ear. For a moment my terror and despair gave place to\r\n" + 
				"hope, but as I bent over him his eyeballs rolled clean around in his\r\n" + 
				"head, and he died. Then while I stood, transfixed with rage and despair,\r\n" + 
				"seeing my crown, my empire, every hope and every ambition, my very life,\r\n" + 
				"lying prostrate there with the dead master, _they_ came, seized me\r\n" + 
				"from behind, and bound me until my veins stood out like cords, and my\r\n" + 
				"voice failed with the paroxysms of my frenzied screams. But I still\r\n" + 
				"raged, bleeding and infuriated among them, and more than one policeman\r\n" + 
				"felt my sharp teeth. Then when I could no longer move they came nearer; I\r\n" + 
				"saw old Hawberk, and behind him my cousin Louis' ghastly face, and\r\n" + 
				"farther away, in the corner, a woman, Constance, weeping softly.\r\n" + 
				"\r\n" + 
				"\"Ah! I see it now!\" I shrieked. \"You have seized the throne and the\r\n" + 
				"empire. Woe! woe to you who are crowned with the crown of the King in\r\n" + 
				"Yellow!\"\r\n" + 
				"\r\n" + 
				"[EDITOR'S NOTE.--Mr. Castaigne died yesterday in the Asylum for Criminal\r\n" + 
				"Insane.]\r\n" + 
				"\r\n" + 
				"THE MASK\r\n" + 
				"\r\n" + 
				"CAMILLA: You, sir, should unmask.\r\n" + 
				"\r\n" + 
				"STRANGER: Indeed?\r\n" + 
				"\r\n" + 
				"CASSILDA: Indeed it's time. We all have laid aside disguise but you.\r\n" + 
				"\r\n" + 
				"STRANGER: I wear no mask.\r\n" + 
				"\r\n" + 
				"CAMILLA: (Terrified, aside to Cassilda.) No mask? No mask!\r\n" + 
				"\r\n" + 
				"_The King in Yellow, Act I, Scene 2_.\r\n" + 
				"\r\n" + 
				"I\r\n" + 
				"\r\n" + 
				"Although I knew nothing of chemistry, I listened fascinated. He picked up\r\n" + 
				"an Easter lily which Genevieve had brought that morning from Notre Dame,\r\n" + 
				"and dropped it into the basin. Instantly the liquid lost its crystalline\r\n" + 
				"clearness. For a second the lily was enveloped in a milk-white foam,\r\n" + 
				"which disappeared, leaving the fluid opalescent. Changing tints of orange\r\n" + 
				"and crimson played over the surface, and then what seemed to be a ray of\r\n" + 
				"pure sunlight struck through from the bottom where the lily was resting.\r\n" + 
				"At the same instant he plunged his hand into the basin and drew out the\r\n" + 
				"flower. \"There is no danger,\" he explained, \"if you choose the right\r\n" + 
				"moment. That golden ray is the signal.\"\r\n" + 
				"\r\n" + 
				"He held the lily toward me, and I took it in my hand. It had turned to\r\n" + 
				"stone, to the purest marble.\r\n" + 
				"\r\n" + 
				"\"You see,\" he said, \"it is without a flaw. What sculptor could reproduce\r\n" + 
				"it?\"\r\n" + 
				"\r\n" + 
				"The marble was white as snow, but in its depths the veins of the lily\r\n" + 
				"were tinged with palest azure, and a faint flush lingered deep in its\r\n" + 
				"heart.\r\n" + 
				"\r\n" + 
				"\"Don't ask me the reason of that,\" he smiled, noticing my wonder. \"I have\r\n" + 
				"no idea why the veins and heart are tinted, but they always are.\r\n" + 
				"Yesterday I tried one of Genevieve's gold-fish,--there it is.\"\r\n" + 
				"\r\n" + 
				"The fish looked as if sculptured in marble. But if you held it to the\r\n" + 
				"light the stone was beautifully veined with a faint blue, and from\r\n" + 
				"somewhere within came a rosy light like the tint which slumbers in an\r\n" + 
				"opal. I looked into the basin. Once more it seemed filled with clearest\r\n" + 
				"crystal.\r\n" + 
				"\r\n" + 
				"\"If I should touch it now?\" I demanded.\r\n" + 
				"\r\n" + 
				"\"I don't know,\" he replied, \"but you had better not try.\"\r\n" + 
				"\r\n" + 
				"\"There is one thing I'm curious about,\" I said, \"and that is where the\r\n" + 
				"ray of sunlight came from.\"\r\n" + 
				"\r\n" + 
				"\"It looked like a sunbeam true enough,\" he said. \"I don't know, it always\r\n" + 
				"comes when I immerse any living thing. Perhaps,\" he continued, smiling,\r\n" + 
				"\"perhaps it is the vital spark of the creature escaping to the source\r\n" + 
				"from whence it came.\"\r\n" + 
				"\r\n" + 
				"I saw he was mocking, and threatened him with a mahl-stick, but he only\r\n" + 
				"laughed and changed the subject.\r\n" + 
				"\r\n" + 
				"\"Stay to lunch. Genevieve will be here directly.\"\r\n" + 
				"\r\n" + 
				"\"I saw her going to early mass,\" I said, \"and she looked as fresh and\r\n" + 
				"sweet as that lily--before you destroyed it.\"\r\n" + 
				"\r\n" + 
				"\"Do you think I destroyed it?\" said Boris gravely.\r\n" + 
				"\r\n" + 
				"\"Destroyed, preserved, how can we tell?\"\r\n" + 
				"\r\n" + 
				"We sat in the corner of a studio near his unfinished group of the\r\n" + 
				"\"Fates.\" He leaned back on the sofa, twirling a sculptor's chisel and\r\n" + 
				"squinting at his work.\r\n" + 
				"\r\n" + 
				"\"By the way,\" he said, \"I have finished pointing up that old academic\r\n" + 
				"Ariadne, and I suppose it will have to go to the Salon. It's all I have\r\n" + 
				"ready this year, but after the success the 'Madonna' brought me I feel\r\n" + 
				"ashamed to send a thing like that.\"\r\n" + 
				"\r\n" + 
				"The \"Madonna,\" an exquisite marble for which Genevieve had sat, had been\r\n" + 
				"the sensation of last year's Salon. I looked at the Ariadne. It was a\r\n" + 
				"magnificent piece of technical work, but I agreed with Boris that the\r\n" + 
				"world would expect something better of him than that. Still, it was\r\n" + 
				"impossible now to think of finishing in time for the Salon that splendid\r\n" + 
				"terrible group half shrouded in the marble behind me. The \"Fates\" would\r\n" + 
				"have to wait.\r\n" + 
				"\r\n" + 
				"We were proud of Boris Yvain. We claimed him and he claimed us on the\r\n" + 
				"strength of his having been born in America, although his father was\r\n" + 
				"French and his mother was a Russian. Every one in the Beaux Arts called\r\n" + 
				"him Boris. And yet there were only two of us whom he addressed in the\r\n" + 
				"same familiar way--Jack Scott and myself.\r\n" + 
				"\r\n" + 
				"Perhaps my being in love with Genevieve had something to do with his\r\n" + 
				"affection for me. Not that it had ever been acknowledged between us. But\r\n" + 
				"after all was settled, and she had told me with tears in her eyes that it\r\n" + 
				"was Boris whom she loved, I went over to his house and congratulated him.\r\n" + 
				"The perfect cordiality of that interview did not deceive either of us, I\r\n" + 
				"always believed, although to one at least it was a great comfort. I do\r\n" + 
				"not think he and Genevieve ever spoke of the matter together, but Boris\r\n" + 
				"knew.\r\n" + 
				"\r\n" + 
				"Genevieve was lovely. The Madonna-like purity of her face might have been\r\n" + 
				"inspired by the Sanctus in Gounod's Mass. But I was always glad when she\r\n" + 
				"changed that mood for what we called her \"April Manoeuvres.\" She was\r\n" + 
				"often as variable as an April day. In the morning grave, dignified and\r\n" + 
				"sweet, at noon laughing, capricious, at evening whatever one least\r\n" + 
				"expected. I preferred her so rather than in that Madonna-like\r\n" + 
				"tranquillity which stirred the depths of my heart. I was dreaming of\r\n" + 
				"Genevieve when he spoke again.\r\n" + 
				"\r\n" + 
				"\"What do you think of my discovery, Alec?\"\r\n" + 
				"\r\n" + 
				"\"I think it wonderful.\"\r\n" + 
				"\r\n" + 
				"\"I shall make no use of it, you know, beyond satisfying my own curiosity\r\n" + 
				"so far as may be, and the secret will die with me.\"\r\n" + 
				"\r\n" + 
				"\"It would be rather a blow to sculpture, would it not? We painters lose\r\n" + 
				"more than we ever gain by photography.\"\r\n" + 
				"\r\n" + 
				"Boris nodded, playing with the edge of the chisel.\r\n" + 
				"\r\n" + 
				"\"This new vicious discovery would corrupt the world of art. No, I shall\r\n" + 
				"never confide the secret to any one,\" he said slowly.\r\n" + 
				"\r\n" + 
				"It would be hard to find any one less informed about such phenomena than\r\n" + 
				"myself; but of course I had heard of mineral springs so saturated with\r\n" + 
				"silica that the leaves and twigs which fell into them were turned to\r\n" + 
				"stone after a time. I dimly comprehended the process, how the silica\r\n" + 
				"replaced the vegetable matter, atom by atom, and the result was a\r\n" + 
				"duplicate of the object in stone. This, I confess, had never interested\r\n" + 
				"me greatly, and as for the ancient fossils thus produced, they disgusted\r\n" + 
				"me. Boris, it appeared, feeling curiosity instead of repugnance, had\r\n" + 
				"investigated the subject, and had accidentally stumbled on a solution\r\n" + 
				"which, attacking the immersed object with a ferocity unheard of, in a\r\n" + 
				"second did the work of years. This was all I could make out of the\r\n" + 
				"strange story he had just been telling me. He spoke again after a long\r\n" + 
				"silence.\r\n" + 
				"\r\n" + 
				"\"I am almost frightened when I think what I have found. Scientists would\r\n" + 
				"go mad over the discovery. It was so simple too; it discovered itself.\r\n" + 
				"When I think of that formula, and that new element precipitated in\r\n" + 
				"metallic scales--\"\r\n" + 
				"\r\n" + 
				"\"What new element?\"\r\n" + 
				"\r\n" + 
				"\"Oh, I haven't thought of naming it, and I don't believe I ever shall.\r\n" + 
				"There are enough precious metals now in the world to cut throats over.\"\r\n" + 
				"\r\n" + 
				"I pricked up my ears. \"Have you struck gold, Boris?\"\r\n" + 
				"\r\n" + 
				"\"No, better;--but see here, Alec!\" he laughed, starting up. \"You and I\r\n" + 
				"have all we need in this world. Ah! how sinister and covetous you look\r\n" + 
				"already!\" I laughed too, and told him I was devoured by the desire for\r\n" + 
				"gold, and we had better talk of something else; so when Genevieve came in\r\n" + 
				"shortly after, we had turned our backs on alchemy.\r\n" + 
				"\r\n" + 
				"Genevieve was dressed in silvery grey from head to foot. The light\r\n" + 
				"glinted along the soft curves of her fair hair as she turned her cheek to\r\n" + 
				"Boris; then she saw me and returned my greeting. She had never before\r\n" + 
				"failed to blow me a kiss from the tips of her white fingers, and I\r\n" + 
				"promptly complained of the omission. She smiled and held out her hand,\r\n" + 
				"which dropped almost before it had touched mine; then she said, looking\r\n" + 
				"at Boris--\r\n" + 
				"\r\n" + 
				"\"You must ask Alec to stay for luncheon.\" This also was something new.\r\n" + 
				"She had always asked me herself until to-day.\r\n" + 
				"\r\n" + 
				"\"I did,\" said Boris shortly.\r\n" + 
				"\r\n" + 
				"\"And you said yes, I hope?\" She turned to me with a charming conventional\r\n" + 
				"smile. I might have been an acquaintance of the day before yesterday. I\r\n" + 
				"made her a low bow. \"J'avais bien l'honneur, madame,\" but refusing to\r\n" + 
				"take up our usual bantering tone, she murmured a hospitable commonplace\r\n" + 
				"and disappeared. Boris and I looked at one another.\r\n" + 
				"\r\n" + 
				"\"I had better go home, don't you think?\" I asked.\r\n" + 
				"\r\n" + 
				"\"Hanged if I know,\" he replied frankly.\r\n" + 
				"\r\n" + 
				"While we were discussing the advisability of my departure Genevieve\r\n" + 
				"reappeared in the doorway without her bonnet. She was wonderfully\r\n" + 
				"beautiful, but her colour was too deep and her lovely eyes were too\r\n" + 
				"bright. She came straight up to me and took my arm.\r\n" + 
				"\r\n" + 
				"\"Luncheon is ready. Was I cross, Alec? I thought I had a headache, but I\r\n" + 
				"haven't. Come here, Boris;\" and she slipped her other arm through his.\r\n" + 
				"\"Alec knows that after you there is no one in the world whom I like as\r\n" + 
				"well as I like him, so if he sometimes feels snubbed it won't hurt him.\"\r\n" + 
				"\r\n" + 
				"\"A la bonheur!\" I cried, \"who says there are no thunderstorms in April?\"\r\n" + 
				"\r\n" + 
				"\"Are you ready?\" chanted Boris. \"Aye ready;\" and arm-in-arm we raced into\r\n" + 
				"the dining-room, scandalizing the servants. After all we were not so much\r\n" + 
				"to blame; Genevieve was eighteen, Boris was twenty-three, and I not quite\r\n" + 
				"twenty-one.\r\n" + 
				"\r\n" + 
				"II\r\n" + 
				"\r\n" + 
				"Some work that I was doing about this time on the decorations for\r\n" + 
				"Genevieve's boudoir kept me constantly at the quaint little hotel in the\r\n" + 
				"Rue Sainte-Cecile. Boris and I in those days laboured hard but as we\r\n" + 
				"pleased, which was fitfully, and we all three, with Jack Scott, idled a\r\n" + 
				"great deal together.\r\n" + 
				"\r\n" + 
				"One quiet afternoon I had been wandering alone over the house examining\r\n" + 
				"curios, prying into odd corners, bringing out sweetmeats and cigars from\r\n" + 
				"strange hiding-places, and at last I stopped in the bathing-room. Boris,\r\n" + 
				"all over clay, stood there washing his hands.\r\n" + 
				"\r\n" + 
				"The room was built of rose-coloured marble excepting the floor, which was\r\n" + 
				"tessellated in rose and grey. In the centre was a square pool sunken\r\n" + 
				"below the surface of the floor; steps led down into it, sculptured\r\n" + 
				"pillars supported a frescoed ceiling. A delicious marble Cupid appeared\r\n" + 
				"to have just alighted on his pedestal at the upper end of the room. The\r\n" + 
				"whole interior was Boris' work and mine. Boris, in his working-clothes of\r\n" + 
				"white canvas, scraped the traces of clay and red modelling wax from his\r\n" + 
				"handsome hands, and coquetted over his shoulder with the Cupid.\r\n" + 
				"\r\n" + 
				"\"I see you,\" he insisted, \"don't try to look the other way and pretend\r\n" + 
				"not to see me. You know who made you, little humbug!\"\r\n" + 
				"\r\n" + 
				"It was always my role to interpret Cupid's sentiments in these\r\n" + 
				"conversations, and when my turn came I responded in such a manner, that\r\n" + 
				"Boris seized my arm and dragged me toward the pool, declaring he would\r\n" + 
				"duck me. Next instant he dropped my arm and turned pale. \"Good God!\" he\r\n" + 
				"said, \"I forgot the pool is full of the solution!\"";
	}
}
